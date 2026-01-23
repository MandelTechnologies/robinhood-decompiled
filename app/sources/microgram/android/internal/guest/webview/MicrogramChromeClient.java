package microgram.android.internal.guest.webview;

import android.annotation.SuppressLint;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MicrogramChromeClient.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, m3636d2 = {"Lmicrogram/android/internal/guest/webview/MicrogramChromeClient;", "Landroid/webkit/WebChromeClient;", "<init>", "()V", "onConsoleMessage", "", "consoleMessage", "Landroid/webkit/ConsoleMessage;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class MicrogramChromeClient extends WebChromeClient {

    /* compiled from: MicrogramChromeClient.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            try {
                iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.webkit.WebChromeClient
    @SuppressLint({"LogNotTimber"})
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Intrinsics.checkNotNullParameter(consoleMessage, "consoleMessage");
        String str = consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + " | " + consoleMessage.message();
        ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
        Intrinsics.checkNotNull(messageLevel);
        int i = WhenMappings.$EnumSwitchMapping$0[messageLevel.ordinal()];
        if (i == 1) {
            Log.v("Microgram.Guest", str);
        } else if (i == 2) {
            Log.i("Microgram.Guest", str);
        } else if (i == 3) {
            Log.w("Microgram.Guest", str);
        } else if (i == 4) {
            Log.e("Microgram.Guest", str);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            Log.d("Microgram.Guest", str);
        }
        return true;
    }
}
