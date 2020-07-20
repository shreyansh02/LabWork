*NumberFormat is an abstract base class for all number formats. This class provides the interface for formatting and parsing numbers. NumberFormat also provides methods for determining which locales (US, India, Italy, etc) have number formats, and what their names are. NumberFormat helps you to format and parse numbers for any locale.*

<b>Some important points about NumberFormat class:</b>

1) NumberFormat class is present in java.text package and it is an abstract class.
2) NumberFormat class implements Serializable, Cloneable.
3) NumberFormat class is the direct child class of format class.
4) Number Formats are generally not synchornized. It is recommended to create separate format instances for each theard. If multiple threads access a format concurrently, it must be synchornized externally.

<b>Methods present in NumberFormat class:</b>

*public static NumberFormat getInstance();* : To get the NumberFormat object for default Locale.

*public static NumberFormat getCurrencyInstance();* : To get the NumberFormat object for default Locale to represent in specific Currency.

*public static NumberFormat getPercentInstance();* :

*public static NumberFormat getInstance(Locale l);* : To get the NumberFormat object for the specified Locale object.

*public static format(long l);* :To convert java number to locale object.
