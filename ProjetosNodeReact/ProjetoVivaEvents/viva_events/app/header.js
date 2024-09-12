// components/Header.js

import Image from 'next/image';
import styles from './header.module.css'; // Certifique-se de que o nome do arquivo esteja correto

export default function Header() {
  return (
    <header className={styles.header}>
      <div className={styles.logoContainer}>
        <Image
          src="https://nextjs.org/icons/next.svg"
          alt="Next.js logo"
          width={180}
          height={38}
          priority
        />
      </div>
      <div className={styles.buttons}>
        <a href="/loginuser" className={styles.button}>Login</a>
        <a href="/registeruser" className={styles.button}>Cadastro</a>
      </div>
    </header>
  );
}
