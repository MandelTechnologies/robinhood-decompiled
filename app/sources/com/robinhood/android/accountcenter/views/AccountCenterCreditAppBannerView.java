package com.robinhood.android.accountcenter.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.compose.C11917R;
import com.robinhood.android.creditcard.contracts.CreditCardWaitlistIntentKey;
import com.robinhood.android.lib.creditcard.p165ui.invite.CreditApplicationInviteBannerComposable;
import com.robinhood.android.lib.creditcard.p165ui.invite.CreditApplicationInviteBannerDuxo;
import com.robinhood.android.lib.creditcard.p165ui.invite.CreditApplicationInviteBannerDuxo4;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.utils.p409ui.view.Bindable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: AccountCenterCreditAppBannerView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\r\u0010\u0016\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u0014H\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AccountCenterCreditAppBannerView;", "Lcom/robinhood/compose/app/GenericComposeView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$CreditAppInviteBanner;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "kotlin.jvm.PlatformType", "bind", "", "state", "Content", "(Landroidx/compose/runtime/Composer;I)V", "disposeComposition", "startCreditApplication", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountCenterCreditAppBannerView extends Hammer_AccountCenterCreditAppBannerView implements Bindable<UiTypedAccountCenterItem.CreditAppInviteBanner> {
    public static final int $stable = 8;
    private final ComposeView composeView;
    public Navigator navigator;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(AccountCenterCreditAppBannerView accountCenterCreditAppBannerView, int i, Composer composer, int i2) {
        accountCenterCreditAppBannerView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(UiTypedAccountCenterItem.CreditAppInviteBanner state) {
        Intrinsics.checkNotNullParameter(state, "state");
    }

    public /* synthetic */ AccountCenterCreditAppBannerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCenterCreditAppBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        ComposeView composeView = (ComposeView) findViewById(C11917R.id.compose_view);
        this.composeView = composeView;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow.INSTANCE);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1779205429);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1779205429, i2, -1, "com.robinhood.android.accountcenter.views.AccountCenterCreditAppBannerView.Content (AccountCenterCreditAppBannerView.kt:38)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AccountCenterCreditAppBannerView2(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CreditApplicationInviteBannerComposable.InviteBanner(CreditApplicationInviteBannerDuxo4.ACCOUNT, null, (Function0) ((KFunction) objRememberedValue), true, null, composerStartRestartGroup, 3078, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.accountcenter.views.AccountCenterCreditAppBannerView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountCenterCreditAppBannerView.Content$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void disposeComposition() {
        this.composeView.disposeComposition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCreditApplication() {
        Navigator navigator = getNavigator();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, context, new CreditCardWaitlistIntentKey(null, null, false, CreditApplicationInviteBannerDuxo.INSTANCE.getEntryPointSource(CreditApplicationInviteBannerDuxo4.ACCOUNT), false, false, 55, null), null, false, null, null, 60, null);
    }
}
