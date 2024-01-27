/*
 * 
 * Выявить какие есть возможные хотды у шахмат: конь и черная пешка. Начальные позиции для шахмат задаются пользователем
 * 
 */

package lab_8;

abstract class Figure {
    protected char column;
    protected int row;

    public Figure(char column, int row) {
        this.column = column;
        this.row = row;
    }

    public void U() {
        row++;
    }

    public void D() {
        row--;
    }

    public void R() {
        column++;
    }

    public void L() {
        column--;
    }

    public abstract void mov();
}

class BlackPawn extends Figure {
    public BlackPawn(char column, int row) {
        super(column, row);
    }

    @Override
    public void mov() {
        if(column >= 'A' && column <= 'H' && row > 1 && row < 8){
            System.out.println("Возможные ходы для черной пешки " + column + row + ":");
            if(row == 7) {
                D(); D();
                System.out.println("Вниз на две клетки: "+ column + row);
                U(); U();
            } if(row >=2 && row <=7) {
                D();
                System.out.println("Вниз на одну клетку: "+ column + row);
                U();
            } if(row == 1) {
                System.out.println("Вам нужно поменять фигуру на одну из возможных: ладья, конь, ферзь, слон");
            }
        } else {
            System.out.println("Некорректные данные");
        }
    }
}

class Knight extends Figure {

    public Knight(char column, int row) {
        super(column, row);
    }

    @Override
    public void mov() {
        if(column >= 'A' && column <= 'H' && row >  0 && row < 9) {
            if(column > 'B' && column < 'G' && row > 2 && row < 7) {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            U(); U(); L();
            System.out.println("Вверх-вверх влево " + column + row);
            D(); D(); R(); // возврат в исходное положение

            U(); U(); R();
            System.out.println("Вверхх-вверх вправо " + column + row);
            D(); D(); L(); // возврат в исходное положение

            R(); R(); U();
            System.out.println("Вправо-вправо вверх " + column + row);
            L(); L(); D(); // возврат в исходное положение

            R(); R(); D();
            System.out.println("Вправо-вправо вниз " + column + row);
            L(); L(); U(); // возврат в исходное положение

            D(); D(); R();
            System.out.println("Вниз-вниз вправо " + column + row);
            U(); U(); L(); // возврат в исходное положение

            D(); D(); L();
            System.out.println("Вниз-вниз влево " + column + row);
            U(); U(); R(); // возврат в исходное положение

            L(); L(); U();
            System.out.println("влево-влево вверх " + column + row);
            R(); R(); D(); // возврат в исходное положение

            L(); L(); D();
            System.out.println("Влево-влево вниз " + column + row);
            R(); R(); U();
        }   if(row == 7 && column > 'B' && column < 'G') {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            L(); L(); U();
            System.out.println("влево-влево вверх " + column + row);
            R(); R(); D(); // возврат в исходное положение

            L(); L(); D();
            System.out.println("Влево-влево вниз " + column + row);
            R(); R(); U(); // возврат в исходное положение

            D(); D(); R();
            System.out.println("Вниз-вниз вправо " + column + row);
            U(); U(); L(); // возврат в исходное положение

            D(); D(); L();
            System.out.println("Вниз-вниз влево " + column + row);
            U(); U(); R(); // возврат в исходное положение

            R(); R(); U();
            System.out.println("Вправо-вправо вверх " + column + row);
            L(); L(); D(); // возврат в исходное положение

            R(); R(); D();
            System.out.println("Вправо-вправо вниз " + column + row);
            L(); L(); U(); // возврат в исходное положение
        }   if(row == 2 && column > 'B' && column < 'G') {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            L(); L(); U();
            System.out.println("влево-влево вверх " + column + row);
            R(); R(); D(); // возврат в исходное положение

            L(); L(); D();
            System.out.println("Влево-влево вниз " + column + row);
            R(); R(); U(); // возврат в исходное положение

            U(); U(); L();
            System.out.println("Вверх-вверх влево " + column + row);
            D(); D(); R(); // возврат в исходное положение

            U(); U(); R();
            System.out.println("Вверхх-вверх вправо " + column + row);
            D(); D(); L(); // возврат в исходное положение

            R(); R(); U();
            System.out.println("Вправо-вправо вверх " + column + row);
            L(); L(); D(); // возврат в исходное положение

            R(); R(); D();
            System.out.println("Вправо-вправо вниз " + column + row);
            L(); L(); U(); // возврат в исходное положение
        }   if(row == 8 && column > 'B' && column < 'G') {
            System.out.println("Возможные ходы для коня " + column + row + ":");
           
            L(); L(); D();
            System.out.println("Влево-влево вниз " + column + row);
            R(); R(); U(); // возврат в исходное положение

            R(); R(); D();
            System.out.println("Вправо-вправо вниз " + column + row);
            L(); L(); U(); // возврат в исходное положение

            D(); D(); R();
            System.out.println("Вниз-вниз вправо " + column + row);
            U(); U(); L(); // возврат в исходное положение

            D(); D(); L();
            System.out.println("Вниз-вниз влево " + column + row);
            U(); U(); R(); // возврат в исходное положение
        }   if(row == 1 && column > 'B' && column < 'G') {
            System.out.println("Возможные ходы для коня " + column + row + ":");
            
            R(); R(); U();
            System.out.println("Вправо-вправо вверх " + column + row);
            L(); L(); D(); // возврат в исходное положение

            L(); L(); U();
            System.out.println("влево-влево вверх " + column + row);
            R(); R(); D(); // возврат в исходное положение
            
            U(); U(); L();
            System.out.println("Вверх-вверх влево " + column + row);
            D(); D(); R(); // возврат в исходное положение

            U(); U(); R();
            System.out.println("Вверхх-вверх вправо " + column + row);
            D(); D(); L(); // возврат в исходное положение
        }   if(column == 'G' && row > 2 && row < 7) {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            D(); D(); R();
            System.out.println("Вниз-вниз вправо " + column + row);
            U(); U(); L(); // возврат в исходное положение

            D(); D(); L();
            System.out.println("Вниз-вниз влево " + column + row);
            U(); U(); R(); // возврат в исходное положение

            L(); L(); U();
            System.out.println("влево-влево вверх " + column + row);
            R(); R(); D(); // возврат в исходное положение

            L(); L(); D();
            System.out.println("Влево-влево вниз " + column + row);
            R(); R(); U(); // возврат в исходное положение
            
            U(); U(); L();
            System.out.println("Вверх-вверх влево " + column + row);
            D(); D(); R(); // возврат в исходное положение

            U(); U(); R();
            System.out.println("Вверхх-вверх вправо " + column + row);
            D(); D(); L(); // возврат в исходное положение
        }   if(column == 'B' && row > 2 && row < 7) {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            D(); D(); R();
            System.out.println("Вниз-вниз вправо " + column + row);
            U(); U(); L(); // возврат в исходное положение

            D(); D(); L();
            System.out.println("Вниз-вниз влево " + column + row);
            U(); U(); R(); // возврат в исходное положение

            U(); U(); L();
            System.out.println("Вверх-вверх влево " + column + row);
            D(); D(); R(); // возврат в исходное положение

            U(); U(); R();
            System.out.println("Вверхх-вверх вправо " + column + row);
            D(); D(); L(); // возврат в исходное положение
            
            R(); R(); U();
            System.out.println("Вправо-вправо вверх " + column + row);
            L(); L(); D(); // возврат в исходное положение

            R(); R(); D();
            System.out.println("Вправо-вправо вниз " + column + row);
            L(); L(); U(); // возврат в исходное положение
        }   if(column == 'A' && row > 2 && row < 7) {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            U(); U(); R();
            System.out.println("Вверхх-вверх вправо " + column + row);
            D(); D(); L(); // возврат в исходное положение

            D(); D(); R();
            System.out.println("Вниз-вниз вправо " + column + row);
            U(); U(); L(); // возврат в исходное положение

            R(); R(); U();
            System.out.println("Вправо-вправо вверх " + column + row);
            L(); L(); D(); // возврат в исходное положение

            R(); R(); D();
            System.out.println("Вправо-вправо вниз " + column + row);
            L(); L(); U(); // возврат в исходное положение
        }   if(column == 'H' && row > 2 && row < 7) {
            System.out.println("Возможные ходы для коня " + column + row + ":");
            
            L(); L(); U();
            System.out.println("влево-влево вверх " + column + row);
            R(); R(); D(); // возврат в исходное положение

            L(); L(); D();
            System.out.println("Влево-влево вниз " + column + row);
            R(); R(); U(); // возврат в исходное положение

            U(); U(); L();
            System.out.println("Вверх-вверх влево " + column + row);
            D(); D(); R(); // возврат в исходное положение

            D(); D(); L();
            System.out.println("Вниз-вниз влево " + column + row);
            U(); U(); R(); // возврат в исходное положение
        }   if(row == 7 && column == 'B') {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            D(); D(); R();
            System.out.println("Вниз-вниз вправо " + column + row);
            U(); U(); L(); // возврат в исходное положение

            D(); D(); L();
            System.out.println("Вниз-вниз влево " + column + row);
            U(); U(); R(); // возврат в исходное положение

            R(); R(); U();
            System.out.println("Вправо-вправо вверх " + column + row);
            L(); L(); D(); // возврат в исходное положение

            R(); R(); D();
            System.out.println("Вправо-вправо вниз " + column + row);
            L(); L(); U(); // возврат в исходное положение
        }   if(row == 7 && column == 'G') {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            L(); L(); U();
            System.out.println("влево-влево вверх " + column + row);
            R(); R(); D(); // возврат в исходное положение

            L(); L(); D();
            System.out.println("Влево-влево вниз " + column + row);
            R(); R(); U();

            D(); D(); R();
            System.out.println("Вниз-вниз вправо " + column + row);
            U(); U(); L(); // возврат в исходное положение

            D(); D(); L();
            System.out.println("Вниз-вниз влево " + column + row);
            U(); U(); R(); // возврат в исходное положение
        }   if(row == 2 && column == 'B') {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            U(); U(); L();
            System.out.println("Вверх-вверх влево " + column + row);
            D(); D(); R(); // возврат в исходное положение

            U(); U(); R();
            System.out.println("Вверхх-вверх вправо " + column + row);
            D(); D(); L(); // возврат в исходное положение

            R(); R(); U();
            System.out.println("Вправо-вправо вверх " + column + row);
            L(); L(); D(); // возврат в исходное положение

            R(); R(); D();
            System.out.println("Вправо-вправо вниз " + column + row);
            L(); L(); U(); // возврат в исходное положение

        }   if(row == 2 && column == 'G') {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            U(); U(); L();
            System.out.println("Вверх-вверх влево " + column + row);
            D(); D(); R(); // возврат в исходное положение

            U(); U(); R();
            System.out.println("Вверхх-вверх вправо " + column + row);
            D(); D(); L(); // возврат в исходное положение

            L(); L(); U();
            System.out.println("влево-влево вверх " + column + row);
            R(); R(); D(); // возврат в исходное положение

            L(); L(); D();
            System.out.println("Влево-влево вниз " + column + row);
            R(); R(); U();
        }   if(column == 'A' && row == 8) {
            System.out.println("Возможные ходы для коня " + column + row + ":");
            
            R(); R(); D();
            System.out.println("Вправо-вправо вниз " + column + row);
            L(); L(); U(); // возврат в исходное положение

            D(); D(); R();
            System.out.println("Вниз-вниз вправо " + column + row);
            U(); U(); L(); // возврат в исходное положение
        }   if(column == 'H' && row == 8) {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            L(); L(); D();
            System.out.println("Влево-влево вниз " + column + row);
            R(); R(); U();

            D(); D(); L();
            System.out.println("Вниз-вниз влево " + column + row);
            U(); U(); R(); // возврат в исходное положение
        }   if(column == 'A' && row == 1) {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            U(); U(); R();
            System.out.println("Вверхх-вверх вправо " + column + row);
            D(); D(); L(); // возврат в исходное положение

            R(); R(); U();
            System.out.println("Вправо-вправо вверх " + column + row);
            L(); L(); D(); // возврат в исходное положение
        }   if(column == 'H' && row == 1) {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            L(); L(); U();
            System.out.println("влево-влево вверх " + column + row);
            R(); R(); D(); // возврат в исходное положение

            U(); U(); L();
            System.out.println("Вверх-вверх влево " + column + row);
            D(); D(); R(); // возврат в исходное положение
        }   if(column == 'B' && row == 1) {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            U(); U(); R();
            System.out.println("Вверх-вверх вправо " + column + row);
            D(); D(); L();

            U(); U(); L();
            System.out.println("Вверх-вверх влево " + column + row);
            D(); D(); R();

            R(); R(); U();
            System.out.println("Вправо-вправо вверх " + column + row);
            L(); L(); D();
        }   if(column == 'G' && row == 1) {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            U(); U(); R();
            System.out.println("Вверх-вверх вправо " + column + row);
            D(); D(); L();

            U(); U(); L();
            System.out.println("Вверх-вверх влево " + column + row);
            D(); D(); R();

            L(); L(); U();
            System.out.println("Влево-влево вверх " + column + row);
            R(); R(); D();
        }   if(column == 'G' && row == 8) {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            D(); D(); R();
            System.out.println("Вниз-вниз вправо " + column + row);
            U(); U(); L();

            D(); D(); L();
            System.out.println("Вниз-вниз влево " + column + row);
            U(); U(); R();

            L(); L(); D();
            System.out.println("Влево-влево вниз " + column + row);
            R(); R(); U();
        }   if(column == 'B' && row == 8) {
            System.out.println("Возможные ходы для коня " + column + row + ":");

            D(); D(); R();
            System.out.println("Вниз-вниз вправо " + column + row);
            U(); U(); L();

            D(); D(); L();
            System.out.println("Вниз-вниз влево " + column + row);
            U(); U(); R();

            R(); R(); D();
            System.out.println("Вправо-вправо вниз " + column + row);
            L(); L(); U();
        } 
        }   else {
            System.out.println("Некоректные данные");
        }   
    }
}

public class lab_8 {
    public static void main(String[] args) {
        BlackPawn bp = new BlackPawn('A', 8);
        Knight knight = new Knight('A', 1);

        bp.mov();
        System.out.println("-------------");
        knight.mov();
    }
}
