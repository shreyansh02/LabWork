*Calendar class in Java is an abstract class that provides methods for converting date between a specific instant in time and a set of calendar fields such as MONTH, YEAR, HOUR, etc. It inherits Object class and implements the Comparable, Serializable, Cloneable interfaces.*



           METHOD	                                                                   DESCRIPTION

abstract void add(int field, int amount)           :-              It is used to add or subtract the specified amount of time to the given calendar field, based on
                                                                  the calendar’s rules.
                                                          
int get(int field)                                 :-             It is used to return the value of the given calendar field.

abstract int getMaximum(int field)                 :-             It is used to return the maximum value for the given calendar field of this Calendar instance.

abstract int getMinimum(int field)                 :-             It is used to return the minimum value for the given calendar field of this Calendar instance.

Date getTime()                                     :-             It is used to return a Date object representing this Calendar’s time value.</td
