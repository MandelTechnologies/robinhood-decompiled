package microgram.android;

import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: MicrogramSource.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lmicrogram/android/MicrogramSource;", "Landroid/os/Parcelable;", "<init>", "()V", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "Lmicrogram/android/HttpMicrogramSource;", "Lmicrogram/android/MicrogramApplication;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public abstract class MicrogramSource implements Parcelable {
    public /* synthetic */ MicrogramSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getIdentifier();

    private MicrogramSource() {
    }
}
