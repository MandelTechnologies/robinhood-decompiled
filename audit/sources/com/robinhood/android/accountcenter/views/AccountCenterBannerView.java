package com.robinhood.android.accountcenter.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.accountcenter.AccountCenterAdapter;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.utils.p409ui.view.Bindable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: AccountCenterBannerView.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\r\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0016R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AccountCenterBannerView;", "Lcom/robinhood/compose/app/GenericComposeView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$InfoBannerItem;", "Lcom/robinhood/android/accountcenter/views/BaseAccountCenterView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "callbacks", "Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;)V", "bind", "", "Content", "(Landroidx/compose/runtime/Composer;I)V", "feature-account-center_externalDebug", "bannerState"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountCenterBannerView extends Hammer_AccountCenterBannerView implements Bindable<UiTypedAccountCenterItem.InfoBannerItem>, BaseAccountCenterView {
    public static final int $stable = 8;
    private AccountCenterAdapter.Callbacks callbacks;
    private final StateFlow2<UiTypedAccountCenterItem.InfoBannerItem> state;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$4(AccountCenterBannerView accountCenterBannerView, int i, Composer composer, int i2) {
        accountCenterBannerView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ AccountCenterBannerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCenterBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.state = StateFlow4.MutableStateFlow(null);
    }

    @Override // com.robinhood.android.accountcenter.views.BaseAccountCenterView
    public AccountCenterAdapter.Callbacks getCallbacks() {
        return this.callbacks;
    }

    @Override // com.robinhood.android.accountcenter.views.BaseAccountCenterView
    public void setCallbacks(AccountCenterAdapter.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(UiTypedAccountCenterItem.InfoBannerItem state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state.setValue(state);
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(510531459);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(510531459, i2, -1, "com.robinhood.android.accountcenter.views.AccountCenterBannerView.Content (AccountCenterBannerView.kt:45)");
            }
            composer2 = composerStartRestartGroup;
            final UiTypedAccountCenterItem.InfoBannerItem infoBannerItemContent$lambda$0 = Content$lambda$0(FlowExtKt.collectAsStateWithLifecycle(this.state, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7));
            if (infoBannerItemContent$lambda$0 != null) {
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer2.changedInstance(this) | composer2.changedInstance(infoBannerItemContent$lambda$0);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBannerView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountCenterBannerView.Content$lambda$3$lambda$2$lambda$1(this.f$0, infoBannerItemContent$lambda$0);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                AccountCenterBannerView2.AccountCenterInfoBanner(infoBannerItemContent$lambda$0, null, (Function0) objRememberedValue, composer2, 0, 2);
                composer2 = composer2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBannerView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountCenterBannerView.Content$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$3$lambda$2$lambda$1(AccountCenterBannerView accountCenterBannerView, UiTypedAccountCenterItem.InfoBannerItem infoBannerItem) {
        AccountCenterAdapter.Callbacks callbacks = accountCenterBannerView.getCallbacks();
        if (callbacks != null) {
            callbacks.onBannerClicked(infoBannerItem.getAction());
        }
        return Unit.INSTANCE;
    }

    private static final UiTypedAccountCenterItem.InfoBannerItem Content$lambda$0(SnapshotState4<UiTypedAccountCenterItem.InfoBannerItem> snapshotState4) {
        return snapshotState4.getValue();
    }
}
