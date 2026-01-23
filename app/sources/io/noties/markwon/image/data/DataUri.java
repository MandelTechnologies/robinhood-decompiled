package io.noties.markwon.image.data;

/* loaded from: classes14.dex */
public class DataUri {
    private final boolean base64;
    private final String contentType;
    private final String data;

    public DataUri(String str, boolean z, String str2) {
        this.contentType = str;
        this.base64 = z;
        this.data = str2;
    }

    public String contentType() {
        return this.contentType;
    }

    public boolean base64() {
        return this.base64;
    }

    public String data() {
        return this.data;
    }

    public String toString() {
        return "DataUri{contentType='" + this.contentType + "', base64=" + this.base64 + ", data='" + this.data + "'}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DataUri dataUri = (DataUri) obj;
            if (this.base64 != dataUri.base64) {
                return false;
            }
            String str = this.contentType;
            if (str == null ? dataUri.contentType != null : !str.equals(dataUri.contentType)) {
                return false;
            }
            String str2 = this.data;
            String str3 = dataUri.data;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.contentType;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + (this.base64 ? 1 : 0)) * 31;
        String str2 = this.data;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
