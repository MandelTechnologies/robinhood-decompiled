package io.noties.markwon.image.data;

/* loaded from: classes14.dex */
public abstract class DataUriParser {
    public abstract DataUri parse(String str);

    public static DataUriParser create() {
        return new Impl();
    }

    static class Impl extends DataUriParser {
        Impl() {
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
        @Override // io.noties.markwon.image.data.DataUriParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DataUri parse(String str) {
            String str2;
            String[] strArrSplit;
            int length;
            int iIndexOf = str.indexOf(44);
            String str3 = null;
            if (iIndexOf < 0) {
                return null;
            }
            boolean z = false;
            if (iIndexOf <= 0 || (length = (strArrSplit = str.substring(0, iIndexOf).split(";")).length) <= 0) {
                str2 = null;
            } else if (length == 1) {
                str2 = strArrSplit[0];
                if ("base64".equals(str2)) {
                    str2 = null;
                    z = true;
                } else if (str2.indexOf(47) <= -1) {
                }
            } else {
                String str4 = strArrSplit[0].indexOf(47) > -1 ? strArrSplit[0] : null;
                boolean zEquals = "base64".equals(strArrSplit[length - 1]);
                str2 = str4;
                z = zEquals;
            }
            if (iIndexOf < str.length()) {
                String strReplaceAll = str.substring(iIndexOf + 1, str.length()).replaceAll("\n", "");
                if (strReplaceAll.length() != 0) {
                    str3 = strReplaceAll;
                }
            }
            return new DataUri(str2, z, str3);
        }
    }
}
