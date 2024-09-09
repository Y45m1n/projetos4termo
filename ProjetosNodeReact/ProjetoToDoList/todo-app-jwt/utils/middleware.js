import jwt from "jsonwebtoken";

export const middleware = (handler) => async (req, res) => {
    const token = req.headers.authorization?.split('')[1]; // obtem o token

    if (!token) {
        return res.status(401).json({ message: 'Token ausente ou inválido'});
    }

    try {
        const decoded = jwt.verify(token, process.env.JWT_SECRET); //verifica o token
        req.user = decoded; //armazena os dados do usuario no request
        return handler(req, res); //continua para o proximo handler
    } catch (error) {
        return res.status(401).json({ message: 'Token inválido'});
    }
}