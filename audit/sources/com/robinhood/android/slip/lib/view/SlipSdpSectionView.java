package com.robinhood.android.slip.lib.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: SlipSdpSectionView.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u001e\u001a\u00020\u001fH\u0017¢\u0006\u0002\u0010 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/view/SlipSdpSectionView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/ViewModelStoreOwner;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "setAccountNumber", "(Ljava/lang/String;)V", "tickerSymbol", "getTickerSymbol", "setTickerSymbol", "locality", "getLocality", "setLocality", "launchArgument", "getLaunchArgument", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public final class SlipSdpSectionView extends Hammer_SlipSdpSectionView {
    public static final int $stable = 8;
    public String accountNumber;
    public String locality;
    public Navigator navigator;
    public String tickerSymbol;
    private final ViewModelStoreOwner viewModelStoreOwner;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(SlipSdpSectionView slipSdpSectionView, int i, Composer composer, int i2) {
        slipSdpSectionView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ SlipSdpSectionView(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewModelStoreOwner, (i & 4) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipSdpSectionView(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.viewModelStoreOwner = viewModelStoreOwner;
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

    public final String getAccountNumber() {
        String str = this.accountNumber;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountNumber");
        return null;
    }

    public final void setAccountNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accountNumber = str;
    }

    public final String getTickerSymbol() {
        String str = this.tickerSymbol;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tickerSymbol");
        return null;
    }

    public final void setTickerSymbol(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tickerSymbol = str;
    }

    public final String getLocality() {
        String str = this.locality;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locality");
        return null;
    }

    public final void setLocality(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.locality = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLaunchArgument() {
        return "{ \"account_number\": \"" + getAccountNumber() + "\", \"symbol\": \"" + getTickerSymbol() + "\", \"locality\": \"" + getLocality() + "\" }";
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-765566925);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-765566925, i2, -1, "com.robinhood.android.slip.lib.view.SlipSdpSectionView.Content (SlipSdpSectionView.kt:45)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalNavigator.getLocalNavigator().provides(getNavigator()), LocalViewModelStoreOwner.INSTANCE.provides(this.viewModelStoreOwner)}, ComposableLambda3.rememberComposableLambda(-1614252813, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.lib.view.SlipSdpSectionView.Content.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1614252813, i3, -1, "com.robinhood.android.slip.lib.view.SlipSdpSectionView.Content.<anonymous> (SlipSdpSectionView.kt:50)");
                    }
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1);
                    RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication("app-slip-recommendations", null, 2, null);
                    String launchArgument = SlipSdpSectionView.this.getLaunchArgument();
                    Context context = SlipSdpSectionView.this.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
                    if (appCompatActivityFindActivityBaseContext == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    FragmentManager supportFragmentManager = appCompatActivityFindActivityBaseContext.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication, supportFragmentManager, modifierM21623defaultHorizontalPaddingrAjV9yQ, launchArgument, SlipSdpSectionView2.INSTANCE.m18939getLambda$1166366492$feature_lib_slip_externalDebug(), null, null, false, null, composer2, 24576, 480);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.lib.view.SlipSdpSectionView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipSdpSectionView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
