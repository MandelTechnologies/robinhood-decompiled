package com.robinhood.shared.common.screenshot.sharing.p372ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.robinhood.shared.common.screenshot.sharing.CaptureScreenshot;
import com.robinhood.shared.common.screenshot.sharing.ShareScreenshot;
import com.robinhood.utils.compose.ClipboardUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: ShareScreenshotBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u000f\u0082\u0001\u0004\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction;", "", "<init>", "()V", "onClick", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "shareTitle", "", "message", "clipboardUtil", "Lcom/robinhood/utils/compose/ClipboardUtil;", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/compose/ClipboardUtil;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Messaging", "Copy", "More", "ExternalApp", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction$Copy;", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction$ExternalApp;", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction$Messaging;", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction$More;", "lib-screenshot-sharing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.screenshot.sharing.ui.ShareOptionAction, reason: use source file name */
/* loaded from: classes26.dex */
public abstract class ShareScreenshotBottomSheet2 {
    public static final int $stable = 0;

    public /* synthetic */ ShareScreenshotBottomSheet2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object onClick(Context context, Bitmap bitmap, String str, String str2, ClipboardUtil clipboardUtil, Continuation<? super Unit> continuation);

    private ShareScreenshotBottomSheet2() {
    }

    /* compiled from: ShareScreenshotBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u000bHÖ\u0001¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction$Messaging;", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction;", "<init>", "()V", "onClick", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "shareTitle", "", "message", "clipboardUtil", "Lcom/robinhood/utils/compose/ClipboardUtil;", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/compose/ClipboardUtil;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "equals", "", "other", "", "hashCode", "", "toString", "lib-screenshot-sharing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.screenshot.sharing.ui.ShareOptionAction$Messaging */
    public static final /* data */ class Messaging extends ShareScreenshotBottomSheet2 {
        public static final int $stable = 0;
        public static final Messaging INSTANCE = new Messaging();

        public boolean equals(Object other) {
            return this == other || (other instanceof Messaging);
        }

        public int hashCode() {
            return -2094031183;
        }

        public String toString() {
            return "Messaging";
        }

        private Messaging() {
            super(null);
        }

        @Override // com.robinhood.shared.common.screenshot.sharing.p372ui.ShareScreenshotBottomSheet2
        public Object onClick(Context context, Bitmap bitmap, String str, String str2, ClipboardUtil clipboardUtil, Continuation<? super Unit> continuation) {
            Object objShareScreenshotViaSms$default = ShareScreenshot.shareScreenshotViaSms$default(context, bitmap, null, str2, continuation, 4, null);
            return objShareScreenshotViaSms$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objShareScreenshotViaSms$default : Unit.INSTANCE;
        }
    }

    /* compiled from: ShareScreenshotBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u000bHÖ\u0001¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction$Copy;", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction;", "<init>", "()V", "onClick", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "shareTitle", "", "message", "clipboardUtil", "Lcom/robinhood/utils/compose/ClipboardUtil;", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/compose/ClipboardUtil;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "equals", "", "other", "", "hashCode", "", "toString", "lib-screenshot-sharing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.screenshot.sharing.ui.ShareOptionAction$Copy */
    public static final /* data */ class Copy extends ShareScreenshotBottomSheet2 {
        public static final int $stable = 0;
        public static final Copy INSTANCE = new Copy();

        public boolean equals(Object other) {
            return this == other || (other instanceof Copy);
        }

        public int hashCode() {
            return 82407336;
        }

        public String toString() {
            return "Copy";
        }

        private Copy() {
            super(null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r4, r5, r6) == r9) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.robinhood.shared.common.screenshot.sharing.p372ui.ShareScreenshotBottomSheet2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object onClick(Context context, Bitmap bitmap, String str, String str2, ClipboardUtil clipboardUtil, Continuation<? super Unit> continuation) {
            ShareScreenshotBottomSheet3 shareScreenshotBottomSheet3;
            if (continuation instanceof ShareScreenshotBottomSheet3) {
                shareScreenshotBottomSheet3 = (ShareScreenshotBottomSheet3) continuation;
                int i = shareScreenshotBottomSheet3.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    shareScreenshotBottomSheet3.label = i - Integer.MIN_VALUE;
                } else {
                    shareScreenshotBottomSheet3 = new ShareScreenshotBottomSheet3(this, continuation);
                }
            }
            Object fileUri = shareScreenshotBottomSheet3.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = shareScreenshotBottomSheet3.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(fileUri);
                shareScreenshotBottomSheet3.L$0 = clipboardUtil;
                shareScreenshotBottomSheet3.label = 1;
                fileUri = CaptureScreenshot.toFileUri(bitmap, context, shareScreenshotBottomSheet3);
                if (fileUri != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(fileUri);
                return Unit.INSTANCE;
            }
            clipboardUtil = (ClipboardUtil) shareScreenshotBottomSheet3.L$0;
            ResultKt.throwOnFailure(fileUri);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            ShareScreenshotBottomSheet4 shareScreenshotBottomSheet4 = new ShareScreenshotBottomSheet4(clipboardUtil, (Uri) fileUri, null);
            shareScreenshotBottomSheet3.L$0 = null;
            shareScreenshotBottomSheet3.label = 2;
        }
    }

    /* compiled from: ShareScreenshotBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u000bHÖ\u0001¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction$More;", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction;", "<init>", "()V", "onClick", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "shareTitle", "", "message", "clipboardUtil", "Lcom/robinhood/utils/compose/ClipboardUtil;", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/compose/ClipboardUtil;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "equals", "", "other", "", "hashCode", "", "toString", "lib-screenshot-sharing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.screenshot.sharing.ui.ShareOptionAction$More */
    public static final /* data */ class More extends ShareScreenshotBottomSheet2 {
        public static final int $stable = 0;
        public static final More INSTANCE = new More();

        public boolean equals(Object other) {
            return this == other || (other instanceof More);
        }

        public int hashCode() {
            return 82705288;
        }

        public String toString() {
            return "More";
        }

        private More() {
            super(null);
        }

        @Override // com.robinhood.shared.common.screenshot.sharing.p372ui.ShareScreenshotBottomSheet2
        public Object onClick(Context context, Bitmap bitmap, String str, String str2, ClipboardUtil clipboardUtil, Continuation<? super Unit> continuation) {
            Object objShareScreenshot = ShareScreenshot.shareScreenshot(context, bitmap, str, str2, continuation);
            return objShareScreenshot == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objShareScreenshot : Unit.INSTANCE;
        }
    }

    /* compiled from: ShareScreenshotBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction$ExternalApp;", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction;", "packageName", "", "<init>", "(Ljava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "onClick", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "shareTitle", "message", "clipboardUtil", "Lcom/robinhood/utils/compose/ClipboardUtil;", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/compose/ClipboardUtil;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-screenshot-sharing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.screenshot.sharing.ui.ShareOptionAction$ExternalApp, reason: from toString */
    public static final /* data */ class ExternalApp extends ShareScreenshotBottomSheet2 {
        public static final int $stable = 0;
        private final String packageName;

        public static /* synthetic */ ExternalApp copy$default(ExternalApp externalApp, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = externalApp.packageName;
            }
            return externalApp.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPackageName() {
            return this.packageName;
        }

        public final ExternalApp copy(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new ExternalApp(packageName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExternalApp) && Intrinsics.areEqual(this.packageName, ((ExternalApp) other).packageName);
        }

        public int hashCode() {
            return this.packageName.hashCode();
        }

        public String toString() {
            return "ExternalApp(packageName=" + this.packageName + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExternalApp(String packageName) {
            super(null);
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            this.packageName = packageName;
        }

        public final String getPackageName() {
            return this.packageName;
        }

        @Override // com.robinhood.shared.common.screenshot.sharing.p372ui.ShareScreenshotBottomSheet2
        public Object onClick(Context context, Bitmap bitmap, String str, String str2, ClipboardUtil clipboardUtil, Continuation<? super Unit> continuation) {
            Object objShareScreenshotToExternalApp = ShareScreenshot.shareScreenshotToExternalApp(context, bitmap, this.packageName, str, str2, continuation);
            return objShareScreenshotToExternalApp == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objShareScreenshotToExternalApp : Unit.INSTANCE;
        }
    }
}
