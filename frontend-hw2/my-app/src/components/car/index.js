import styles from './index.module.scss';

const Car = ({ color = 'blue' }) => (
  <span className={styles.app_test} style={{ color }}>
    Car {color}
  </span>
);

export default Car;
