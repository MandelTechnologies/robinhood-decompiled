package com.robinhood.shared.trade.crypto.p397ui.quickTrade.fragment;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.crypto.contracts.CryptoQuickTradeDialogBottomSheetFragmentKey;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet.CryptoQuickTradeSheetComposable3;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet.CryptoQuickTradeSheetDuxo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: CryptoQuickTradeDialogBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\r\u0010\u0010\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\u0011R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/fragment/CryptoQuickTradeDialogBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "orderUuid", "Ljava/util/UUID;", "getOrderUuid", "()Ljava/util/UUID;", "orderUuid$delegate", "Lkotlin/properties/ReadWriteProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoQuickTradeDialogBottomSheetFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: orderUuid$delegate, reason: from kotlin metadata */
    private final Interfaces3 orderUuid;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoQuickTradeDialogBottomSheetFragment.class, "orderUuid", "getOrderUuid()Ljava/util/UUID;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CryptoQuickTradeDialogBottomSheetFragment cryptoQuickTradeDialogBottomSheetFragment, int i, Composer composer, int i2) {
        cryptoQuickTradeDialogBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public CryptoQuickTradeDialogBottomSheetFragment() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.orderUuid = (Interfaces3) BindSavedState2.savedSerializable(this, uuidRandomUUID).provideDelegate(this, $$delegatedProperties[0]);
    }

    public final UUID getOrderUuid() {
        Object value = this.orderUuid.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (UUID) value;
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Object parent = view.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        view2.setBackgroundTintMode(PorterDuff.Mode.CLEAR);
        view2.setBackgroundTintList(ColorStateList.valueOf(0));
        view2.setBackgroundColor(0);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(476861895);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(476861895, i2, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.fragment.CryptoQuickTradeDialogBottomSheetFragment.ComposeContent (CryptoQuickTradeDialogBottomSheetFragment.kt:35)");
            }
            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-2019462043, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.fragment.CryptoQuickTradeDialogBottomSheetFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-2019462043, i3, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.fragment.CryptoQuickTradeDialogBottomSheetFragment.ComposeContent.<anonymous> (CryptoQuickTradeDialogBottomSheetFragment.kt:37)");
                    }
                    final CryptoQuickTradeDialogBottomSheetFragment cryptoQuickTradeDialogBottomSheetFragment = CryptoQuickTradeDialogBottomSheetFragment.this;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-837708771, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.fragment.CryptoQuickTradeDialogBottomSheetFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-837708771, i4, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.fragment.CryptoQuickTradeDialogBottomSheetFragment.ComposeContent.<anonymous>.<anonymous> (CryptoQuickTradeDialogBottomSheetFragment.kt:38)");
                            }
                            Companion companion = CryptoQuickTradeDialogBottomSheetFragment.INSTANCE;
                            CryptoQuickTradeSheetComposable3.CryptoQuickTradeSheetComposable(new CryptoQuickTradeSheetDuxo.Args(((CryptoQuickTradeDialogBottomSheetFragmentKey) companion.getArgs((Fragment) cryptoQuickTradeDialogBottomSheetFragment)).getCurrencyPairId(), ((CryptoQuickTradeDialogBottomSheetFragmentKey) companion.getArgs((Fragment) cryptoQuickTradeDialogBottomSheetFragment)).getOrderSide(), cryptoQuickTradeDialogBottomSheetFragment.getOrderUuid()), null, null, composer3, 0, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.fragment.CryptoQuickTradeDialogBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeDialogBottomSheetFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CryptoQuickTradeDialogBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/fragment/CryptoQuickTradeDialogBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/fragment/CryptoQuickTradeDialogBottomSheetFragment;", "Lcom/robinhood/android/crypto/contracts/CryptoQuickTradeDialogBottomSheetFragmentKey;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<CryptoQuickTradeDialogBottomSheetFragment, CryptoQuickTradeDialogBottomSheetFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public CryptoQuickTradeDialogBottomSheetFragment createDialogFragment(CryptoQuickTradeDialogBottomSheetFragmentKey cryptoQuickTradeDialogBottomSheetFragmentKey) {
            return (CryptoQuickTradeDialogBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, cryptoQuickTradeDialogBottomSheetFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CryptoQuickTradeDialogBottomSheetFragmentKey getArgs(CryptoQuickTradeDialogBottomSheetFragment cryptoQuickTradeDialogBottomSheetFragment) {
            return (CryptoQuickTradeDialogBottomSheetFragmentKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, cryptoQuickTradeDialogBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoQuickTradeDialogBottomSheetFragment newInstance(CryptoQuickTradeDialogBottomSheetFragmentKey cryptoQuickTradeDialogBottomSheetFragmentKey) {
            return (CryptoQuickTradeDialogBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, cryptoQuickTradeDialogBottomSheetFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoQuickTradeDialogBottomSheetFragment cryptoQuickTradeDialogBottomSheetFragment, CryptoQuickTradeDialogBottomSheetFragmentKey cryptoQuickTradeDialogBottomSheetFragmentKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, cryptoQuickTradeDialogBottomSheetFragment, cryptoQuickTradeDialogBottomSheetFragmentKey);
        }
    }
}
