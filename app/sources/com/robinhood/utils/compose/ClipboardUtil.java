package com.robinhood.utils.compose;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.platform.ClipEntry;
import androidx.compose.p011ui.platform.Clipboard;
import com.robinhood.utils.android.C41827R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClipboardUtil.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/utils/compose/ClipboardUtil;", "", "clipboard", "Landroidx/compose/ui/platform/Clipboard;", "hapticFeedback", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "context", "Landroid/content/Context;", "<init>", "(Landroidx/compose/ui/platform/Clipboard;Landroidx/compose/ui/hapticfeedback/HapticFeedback;Landroid/content/Context;)V", "copyToClipboardWithHapticFeedback", "", "text", "", "showToast", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uri", "Landroid/net/Uri;", "pasteText", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ClipboardUtil {
    public static final int $stable = 8;
    private final Clipboard clipboard;
    private final Context context;
    private final HapticFeedback hapticFeedback;

    /* compiled from: ClipboardUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.compose.ClipboardUtil", m3645f = "ClipboardUtil.kt", m3646l = {37}, m3647m = "copyToClipboardWithHapticFeedback")
    /* renamed from: com.robinhood.utils.compose.ClipboardUtil$copyToClipboardWithHapticFeedback$1 */
    static final class C418291 extends ContinuationImpl {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C418291(Continuation<? super C418291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ClipboardUtil.this.copyToClipboardWithHapticFeedback(null, false, this);
        }
    }

    /* compiled from: ClipboardUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.compose.ClipboardUtil", m3645f = "ClipboardUtil.kt", m3646l = {79}, m3647m = "pasteText")
    /* renamed from: com.robinhood.utils.compose.ClipboardUtil$pasteText$1 */
    static final class C418301 extends ContinuationImpl {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C418301(Continuation<? super C418301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ClipboardUtil.this.pasteText(false, this);
        }
    }

    public ClipboardUtil(Clipboard clipboard, HapticFeedback hapticFeedback, Context context) {
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticFeedback, "hapticFeedback");
        Intrinsics.checkNotNullParameter(context, "context");
        this.clipboard = clipboard;
        this.hapticFeedback = hapticFeedback;
        this.context = context;
    }

    public static /* synthetic */ Object copyToClipboardWithHapticFeedback$default(ClipboardUtil clipboardUtil, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return clipboardUtil.copyToClipboardWithHapticFeedback(str, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copyToClipboardWithHapticFeedback(String str, boolean z, Continuation<? super Unit> continuation) {
        C418291 c418291;
        if (continuation instanceof C418291) {
            c418291 = (C418291) continuation;
            int i = c418291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c418291.label = i - Integer.MIN_VALUE;
            } else {
                c418291 = new C418291(continuation);
            }
        }
        Object obj = c418291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c418291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Clipboard clipboard = this.clipboard;
            ClipEntry clipEntry = new ClipEntry(new ClipData("Copied from Robinhood", new String[]{"text/plain"}, new ClipData.Item(str)));
            c418291.Z$0 = z;
            c418291.label = 1;
            if (clipboard.setClipEntry(clipEntry, c418291) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c418291.Z$0;
            ResultKt.throwOnFailure(obj);
        }
        this.hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        if (z) {
            Context context = this.context;
            Toast.makeText(context, context.getString(C41827R.string.general_copied_to_clipboard), 0).show();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void copyToClipboardWithHapticFeedback$default(ClipboardUtil clipboardUtil, Uri uri, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        clipboardUtil.copyToClipboardWithHapticFeedback(uri, z);
    }

    public final void copyToClipboardWithHapticFeedback(Uri uri, boolean showToast) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        ClipData clipDataNewUri = ClipData.newUri(this.context.getContentResolver(), "Image", uri);
        Object systemService = this.context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(clipDataNewUri);
        this.hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        if (showToast) {
            Context context = this.context;
            Toast.makeText(context, context.getString(C41827R.string.general_copied_to_clipboard), 0).show();
        }
    }

    public static /* synthetic */ Object pasteText$default(ClipboardUtil clipboardUtil, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return clipboardUtil.pasteText(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pasteText(boolean z, Continuation<? super String> continuation) {
        C418301 c418301;
        ClipData clipData;
        ClipData.Item itemAt;
        CharSequence text;
        if (continuation instanceof C418301) {
            c418301 = (C418301) continuation;
            int i = c418301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c418301.label = i - Integer.MIN_VALUE;
            } else {
                c418301 = new C418301(continuation);
            }
        }
        Object clipEntry = c418301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c418301.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(clipEntry);
            Clipboard clipboard = this.clipboard;
            c418301.Z$0 = z;
            c418301.label = 1;
            clipEntry = clipboard.getClipEntry(c418301);
            if (clipEntry == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c418301.Z$0;
            ResultKt.throwOnFailure(clipEntry);
        }
        ClipEntry clipEntry2 = (ClipEntry) clipEntry;
        if (clipEntry2 == null || (clipData = clipEntry2.getClipData()) == null || (itemAt = clipData.getItemAt(0)) == null || (text = itemAt.getText()) == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 31 && z) {
            Context context = this.context;
            Toast.makeText(context, context.getString(C41827R.string.general_pasted_from_clipboard), 0).show();
        }
        return text.toString();
    }
}
