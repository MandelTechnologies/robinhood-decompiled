package com.robinhood.android.accountcenter.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.databinding.IncludeAccountCenterAddAccountBinding;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.view.Inflater;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AccountCenterAddAccountView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AccountCenterAddAccountView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterAddAccountBinding;", "getBinding", "()Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterAddAccountBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$AddAccount;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Companion", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountCenterAddAccountView extends FrameLayout {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountCenterAddAccountView.class, "binding", "getBinding()Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterAddAccountBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCenterAddAccountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, AccountCenterAddAccountView2.INSTANCE);
    }

    private final IncludeAccountCenterAddAccountBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeAccountCenterAddAccountBinding) value;
    }

    public final void bind(final UiTypedAccountCenterItem.AddAccount state, final SduiActionHandler<? super GenericAction> actionHandler) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        getBinding().accountCenterAddAccountComposeView.setContent(ComposableLambda3.composableLambdaInstance(2104418251, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.accountcenter.views.AccountCenterAddAccountView.bind.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2104418251, i, -1, "com.robinhood.android.accountcenter.views.AccountCenterAddAccountView.bind.<anonymous> (AccountCenterAddAccountView.kt:29)");
                }
                Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(AccountCenterAddAccountView.this));
                final UiTypedAccountCenterItem.AddAccount addAccount = state;
                final SduiActionHandler<GenericAction> sduiActionHandler = actionHandler;
                BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-603146791, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.accountcenter.views.AccountCenterAddAccountView.bind.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-603146791, i2, -1, "com.robinhood.android.accountcenter.views.AccountCenterAddAccountView.bind.<anonymous>.<anonymous> (AccountCenterAddAccountView.kt:30)");
                        }
                        final UiTypedAccountCenterItem.AddAccount addAccount2 = addAccount;
                        final SduiActionHandler<GenericAction> sduiActionHandler2 = sduiActionHandler;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-815834514, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.accountcenter.views.AccountCenterAddAccountView.bind.1.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-815834514, i3, -1, "com.robinhood.android.accountcenter.views.AccountCenterAddAccountView.bind.<anonymous>.<anonymous>.<anonymous> (AccountCenterAddAccountView.kt:31)");
                                }
                                ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(addAccount2.getButton());
                                Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                SduiActionHandler<GenericAction> sduiActionHandler3 = sduiActionHandler2;
                                composer3.startReplaceGroup(-1772220517);
                                SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, modifierWrapContentHeight$default, null, sduiActionHandler3, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), centerHorizontally, false, composer3, 12583296, 0);
                                composer3.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* compiled from: AccountCenterAddAccountView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AccountCenterAddAccountView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/accountcenter/views/AccountCenterAddAccountView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<AccountCenterAddAccountView> {
        private final /* synthetic */ Inflater<AccountCenterAddAccountView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public AccountCenterAddAccountView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (AccountCenterAddAccountView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8293R.layout.include_account_center_add_account);
        }
    }
}
