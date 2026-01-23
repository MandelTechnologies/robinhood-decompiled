package microgram.android;

import com.singular.sdk.internal.Constants;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Monitoring.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0014\u0010\u0006\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\bj\u0002`\tH&¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/android/MonitorListener;", "", "onLoading", "", "onReady", "onClosed", "onException", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Ljava/io/IOException;", "Lokio/IOException;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.MonitorListener, reason: use source file name */
/* loaded from: classes14.dex */
public interface Monitoring3 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void onClosed();

    void onException(IOException e);

    void onLoading();

    void onReady();

    /* compiled from: Monitoring.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\b¨\u0006\t"}, m3636d2 = {"Lmicrogram/android/MonitorListener$Companion;", "", "<init>", "()V", "wrapping", "Lmicrogram/android/MonitorListener;", "delegate", "Lkotlin/Lazy;", "Lkotlin/Function0;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: microgram.android.MonitorListener$Companion, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Monitoring3 wrapping(final Lazy<? extends Monitoring3> delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            return new Monitoring3() { // from class: microgram.android.MonitorListener$Companion$wrapping$1
                @Override // microgram.android.Monitoring3
                public void onLoading() {
                    delegate.getValue().onLoading();
                }

                @Override // microgram.android.Monitoring3
                public void onReady() {
                    delegate.getValue().onReady();
                }

                @Override // microgram.android.Monitoring3
                public void onClosed() {
                    delegate.getValue().onClosed();
                }

                @Override // microgram.android.Monitoring3
                public void onException(IOException e) {
                    Intrinsics.checkNotNullParameter(e, "e");
                    delegate.getValue().onException(e);
                }
            };
        }

        public final Monitoring3 wrapping(Function0<? extends Monitoring3> delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            return wrapping(LazyKt.lazy(delegate));
        }
    }
}
