package com.finddreams.androidnewstack.bean;

/**
 * Created by lx on 17-11-14.
 */

public class WeatherBean {

    /**
     * resultcode : 200
     * reason : 查询成功
     * result : {"sk":{"temp":"17","wind_direction":"北风","wind_strength":"2级","humidity":"71%","time":"16:42"},"today":{"temperature":"13℃~17℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"东北风3-4 级","week":"星期二","city":"苏州","date_y":"2017年11月14日","dressing_index":"较冷","dressing_advice":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","uv_index":"最弱","comfort_index":"","wash_index":"较适宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""},"future":{"day_20171114":{"temperature":"13℃~17℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"东北风3-4 级","week":"星期二","date":"20171114"},"day_20171115":{"temperature":"13℃~19℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东风3-4 级","week":"星期三","date":"20171115"},"day_20171116":{"temperature":"16℃~17℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"东南风4-5 级","week":"星期四","date":"20171116"},"day_20171117":{"temperature":"8℃~17℃","weather":"中雨转小雨","weather_id":{"fa":"08","fb":"07"},"wind":"西北风3-4 级","week":"星期五","date":"20171117"},"day_20171118":{"temperature":"4℃~16℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"wind":"北风5-6 级","week":"星期六","date":"20171118"},"day_20171119":{"temperature":"13℃~19℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东风3-4 级","week":"星期日","date":"20171119"},"day_20171120":{"temperature":"8℃~17℃","weather":"中雨转小雨","weather_id":{"fa":"08","fb":"07"},"wind":"西北风3-4 级","week":"星期一","date":"20171120"}}}
     * error_code : 0
     */

    public String resultcode;
    public String reason;
    public ResultBean result;
    public int error_code;

    public static class ResultBean {
        /**
         * sk : {"temp":"17","wind_direction":"北风","wind_strength":"2级","humidity":"71%","time":"16:42"}
         * today : {"temperature":"13℃~17℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"东北风3-4 级","week":"星期二","city":"苏州","date_y":"2017年11月14日","dressing_index":"较冷","dressing_advice":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","uv_index":"最弱","comfort_index":"","wash_index":"较适宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""}
         * future : {"day_20171114":{"temperature":"13℃~17℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"东北风3-4 级","week":"星期二","date":"20171114"},"day_20171115":{"temperature":"13℃~19℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东风3-4 级","week":"星期三","date":"20171115"},"day_20171116":{"temperature":"16℃~17℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"东南风4-5 级","week":"星期四","date":"20171116"},"day_20171117":{"temperature":"8℃~17℃","weather":"中雨转小雨","weather_id":{"fa":"08","fb":"07"},"wind":"西北风3-4 级","week":"星期五","date":"20171117"},"day_20171118":{"temperature":"4℃~16℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"wind":"北风5-6 级","week":"星期六","date":"20171118"},"day_20171119":{"temperature":"13℃~19℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东风3-4 级","week":"星期日","date":"20171119"},"day_20171120":{"temperature":"8℃~17℃","weather":"中雨转小雨","weather_id":{"fa":"08","fb":"07"},"wind":"西北风3-4 级","week":"星期一","date":"20171120"}}
         */

        public SkBean sk;
        public TodayBean today;
        public FutureBean future;

        public static class SkBean {
            /**
             * temp : 17
             * wind_direction : 北风
             * wind_strength : 2级
             * humidity : 71%
             * time : 16:42
             */

            public String temp;
            public String wind_direction;
            public String wind_strength;
            public String humidity;
            public String time;
        }

        public static class TodayBean {
            /**
             * temperature : 13℃~17℃
             * weather : 阴转多云
             * weather_id : {"fa":"02","fb":"01"}
             * wind : 东北风3-4 级
             * week : 星期二
             * city : 苏州
             * date_y : 2017年11月14日
             * dressing_index : 较冷
             * dressing_advice : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
             * uv_index : 最弱
             * comfort_index :
             * wash_index : 较适宜
             * travel_index : 较适宜
             * exercise_index : 较适宜
             * drying_index :
             */

            public String temperature;
            public String weather;
            public WeatherIdBean weather_id;
            public String wind;
            public String week;
            public String city;
            public String date_y;
            public String dressing_index;
            public String dressing_advice;
            public String uv_index;
            public String comfort_index;
            public String wash_index;
            public String travel_index;
            public String exercise_index;
            public String drying_index;

            public static class WeatherIdBean {
                /**
                 * fa : 02
                 * fb : 01
                 */

                public String fa;
                public String fb;
            }
        }

        public static class FutureBean {
            /**
             * day_20171114 : {"temperature":"13℃~17℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"东北风3-4 级","week":"星期二","date":"20171114"}
             * day_20171115 : {"temperature":"13℃~19℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东风3-4 级","week":"星期三","date":"20171115"}
             * day_20171116 : {"temperature":"16℃~17℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"东南风4-5 级","week":"星期四","date":"20171116"}
             * day_20171117 : {"temperature":"8℃~17℃","weather":"中雨转小雨","weather_id":{"fa":"08","fb":"07"},"wind":"西北风3-4 级","week":"星期五","date":"20171117"}
             * day_20171118 : {"temperature":"4℃~16℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"wind":"北风5-6 级","week":"星期六","date":"20171118"}
             * day_20171119 : {"temperature":"13℃~19℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东风3-4 级","week":"星期日","date":"20171119"}
             * day_20171120 : {"temperature":"8℃~17℃","weather":"中雨转小雨","weather_id":{"fa":"08","fb":"07"},"wind":"西北风3-4 级","week":"星期一","date":"20171120"}
             */

            public Day20171114Bean day_20171114;
            public Day20171115Bean day_20171115;
            public Day20171116Bean day_20171116;
            public Day20171117Bean day_20171117;
            public Day20171118Bean day_20171118;
            public Day20171119Bean day_20171119;
            public Day20171120Bean day_20171120;

            public static class Day20171114Bean {
                /**
                 * temperature : 13℃~17℃
                 * weather : 阴转多云
                 * weather_id : {"fa":"02","fb":"01"}
                 * wind : 东北风3-4 级
                 * week : 星期二
                 * date : 20171114
                 */

                public String temperature;
                public String weather;
                public WeatherIdBeanX weather_id;
                public String wind;
                public String week;
                public String date;

                public static class WeatherIdBeanX {
                    /**
                     * fa : 02
                     * fb : 01
                     */

                    public String fa;
                    public String fb;
                }
            }

            public static class Day20171115Bean {
                /**
                 * temperature : 13℃~19℃
                 * weather : 多云
                 * weather_id : {"fa":"01","fb":"01"}
                 * wind : 东风3-4 级
                 * week : 星期三
                 * date : 20171115
                 */

                public String temperature;
                public String weather;
                public WeatherIdBeanXX weather_id;
                public String wind;
                public String week;
                public String date;

                public static class WeatherIdBeanXX {
                    /**
                     * fa : 01
                     * fb : 01
                     */

                    public String fa;
                    public String fb;
                }
            }

            public static class Day20171116Bean {
                /**
                 * temperature : 16℃~17℃
                 * weather : 小雨
                 * weather_id : {"fa":"07","fb":"07"}
                 * wind : 东南风4-5 级
                 * week : 星期四
                 * date : 20171116
                 */

                public String temperature;
                public String weather;
                public WeatherIdBeanXXX weather_id;
                public String wind;
                public String week;
                public String date;

                public static class WeatherIdBeanXXX {
                    /**
                     * fa : 07
                     * fb : 07
                     */

                    public String fa;
                    public String fb;
                }
            }

            public static class Day20171117Bean {
                /**
                 * temperature : 8℃~17℃
                 * weather : 中雨转小雨
                 * weather_id : {"fa":"08","fb":"07"}
                 * wind : 西北风3-4 级
                 * week : 星期五
                 * date : 20171117
                 */

                public String temperature;
                public String weather;
                public WeatherIdBeanXXXX weather_id;
                public String wind;
                public String week;
                public String date;

                public static class WeatherIdBeanXXXX {
                    /**
                     * fa : 08
                     * fb : 07
                     */

                    public String fa;
                    public String fb;
                }
            }

            public static class Day20171118Bean {
                /**
                 * temperature : 4℃~16℃
                 * weather : 多云转晴
                 * weather_id : {"fa":"01","fb":"00"}
                 * wind : 北风5-6 级
                 * week : 星期六
                 * date : 20171118
                 */

                public String temperature;
                public String weather;
                public WeatherIdBeanXXXXX weather_id;
                public String wind;
                public String week;
                public String date;

                public static class WeatherIdBeanXXXXX {
                    /**
                     * fa : 01
                     * fb : 00
                     */

                    public String fa;
                    public String fb;
                }
            }

            public static class Day20171119Bean {
                /**
                 * temperature : 13℃~19℃
                 * weather : 多云
                 * weather_id : {"fa":"01","fb":"01"}
                 * wind : 东风3-4 级
                 * week : 星期日
                 * date : 20171119
                 */

                public String temperature;
                public String weather;
                public WeatherIdBeanXXXXXX weather_id;
                public String wind;
                public String week;
                public String date;

                public static class WeatherIdBeanXXXXXX {
                    /**
                     * fa : 01
                     * fb : 01
                     */

                    public String fa;
                    public String fb;
                }
            }

            public static class Day20171120Bean {
                /**
                 * temperature : 8℃~17℃
                 * weather : 中雨转小雨
                 * weather_id : {"fa":"08","fb":"07"}
                 * wind : 西北风3-4 级
                 * week : 星期一
                 * date : 20171120
                 */

                public String temperature;
                public String weather;
                public WeatherIdBeanXXXXXXX weather_id;
                public String wind;
                public String week;
                public String date;

                public static class WeatherIdBeanXXXXXXX {
                    /**
                     * fa : 08
                     * fb : 07
                     */

                    public String fa;
                    public String fb;
                }
            }
        }
    }
}
