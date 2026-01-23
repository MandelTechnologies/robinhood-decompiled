package com.robinhood.shared.crypto.transfer.history;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.api.HistoryDetailAction;
import com.robinhood.utils.compose.ClipboardUtil;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoTransferHistoryComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b0\n\u0012\u0014\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/history/HistoryDetailActionHandler;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/HistoryDetailAction;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "clipUtil", "Lcom/robinhood/utils/compose/ClipboardUtil;", "context", "Landroid/content/Context;", "modal", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "bottomSheet", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/utils/compose/ClipboardUtil;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;)V", "handle", "", "action", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.history.HistoryDetailActionHandler, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferHistoryComposable6 implements SduiActionHandler<HistoryDetailAction> {
    public static final int $stable = 8;
    private final SnapshotState<GenericAlertContent<HistoryDetailAction>> bottomSheet;
    private final ClipboardUtil clipUtil;
    private final Context context;
    private final SnapshotState<GenericAlertContent<HistoryDetailAction>> modal;
    private final Navigator navigator;
    private final CoroutineScope scope;

    /* compiled from: CryptoTransferHistoryComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.history.HistoryDetailActionHandler$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
            try {
                iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CryptoTransferHistoryComposable6(Navigator navigator, ClipboardUtil clipUtil, Context context, SnapshotState<GenericAlertContent<HistoryDetailAction>> modal, SnapshotState<GenericAlertContent<HistoryDetailAction>> bottomSheet, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(clipUtil, "clipUtil");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modal, "modal");
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.navigator = navigator;
        this.clipUtil = clipUtil;
        this.context = context;
        this.modal = modal;
        this.bottomSheet = bottomSheet;
        this.scope = scope;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(HistoryDetailAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof HistoryDetailAction.CancelYieldOrder)) {
            if (action instanceof HistoryDetailAction.Deeplink) {
                Uri uri = Uri.parse(((HistoryDetailAction.Deeplink) action).getValue2().getUri());
                Navigator navigator = this.navigator;
                Intrinsics.checkNotNull(uri);
                if (navigator.isDeepLinkSupported(uri)) {
                    Navigator.DefaultImpls.handleDeepLink$default(this.navigator, this.context, uri, null, null, false, null, 60, null);
                } else {
                    WebUtils.viewUrl$default(this.context, uri.toString(), 0, 4, (Object) null);
                }
            } else if (action instanceof HistoryDetailAction.Dismiss) {
                this.modal.setValue(null);
                this.bottomSheet.setValue(null);
            } else if (action instanceof HistoryDetailAction.InfoAlert) {
                HistoryDetailAction.InfoAlert infoAlert = (HistoryDetailAction.InfoAlert) action;
                int i = WhenMappings.$EnumSwitchMapping$0[infoAlert.getValue2().getMobile_presentation_style().ordinal()];
                if (i == 1) {
                    this.modal.setValue(infoAlert.getValue2().getAlert());
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.bottomSheet.setValue(infoAlert.getValue2().getAlert());
                }
            } else if (action instanceof HistoryDetailAction.CopyToClipboard) {
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C380351(action, null), 3, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    /* compiled from: CryptoTransferHistoryComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.history.HistoryDetailActionHandler$handle$1", m3645f = "CryptoTransferHistoryComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.history.HistoryDetailActionHandler$handle$1 */
    static final class C380351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HistoryDetailAction $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C380351(HistoryDetailAction historyDetailAction, Continuation<? super C380351> continuation) {
            super(2, continuation);
            this.$action = historyDetailAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTransferHistoryComposable6.this.new C380351(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C380351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ClipboardUtil clipboardUtil = CryptoTransferHistoryComposable6.this.clipUtil;
                String value = ((HistoryDetailAction.CopyToClipboard) this.$action).getValue2().getValue();
                this.label = 1;
                if (clipboardUtil.copyToClipboardWithHapticFeedback(value, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
