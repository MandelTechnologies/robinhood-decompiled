package com.robinhood.android.margin.p174ui.marginaccount;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.instant.p160ui.InstantCashConstants2;
import com.robinhood.android.instant.p160ui.InstantCashUtils;
import com.robinhood.android.lib.margin.prefs.MarginAccountUpsellLastSeen;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.margin.C20999R;
import com.robinhood.android.margin.contracts.MarginAccountUpsellFragmentKey;
import com.robinhood.android.margin.p174ui.marginaccount.MarginAccountUpsellFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoPogBackgroundOverride;
import com.robinhood.compose.bento.component.BentoPogContent;
import com.robinhood.compose.bento.component.BentoPogDefaults;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoPogState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.LongPreference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarginAccountUpsellFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\r\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R$\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/marginaccount/MarginAccountUpsellFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "lastSeen", "Lcom/robinhood/prefs/LongPreference;", "getLastSeen$annotations", "getLastSeen", "()Lcom/robinhood/prefs/LongPreference;", "setLastSeen", "(Lcom/robinhood/prefs/LongPreference;)V", "onResume", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginAccountUpsellFragment extends GenericComposeFragment {
    public LongPreference lastSeen;
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(MarginAccountUpsellFragment marginAccountUpsellFragment, int i, Composer composer, int i2) {
        marginAccountUpsellFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @MarginAccountUpsellLastSeen
    public static /* synthetic */ void getLastSeen$annotations() {
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    public final LongPreference getLastSeen() {
        LongPreference longPreference = this.lastSeen;
        if (longPreference != null) {
            return longPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lastSeen");
        return null;
    }

    public final void setLastSeen(LongPreference longPreference) {
        Intrinsics.checkNotNullParameter(longPreference, "<set-?>");
        this.lastSeen = longPreference;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getLastSeen().set(System.currentTimeMillis());
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(134856624);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(134856624, i2, -1, "com.robinhood.android.margin.ui.marginaccount.MarginAccountUpsellFragment.ComposeContent (MarginAccountUpsellFragment.kt:54)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1602599688, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.ui.marginaccount.MarginAccountUpsellFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1602599688, i3, -1, "com.robinhood.android.margin.ui.marginaccount.MarginAccountUpsellFragment.ComposeContent.<anonymous> (MarginAccountUpsellFragment.kt:56)");
                    }
                    float f = 0;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, 0, 0L, 0L, WindowInsetsKt.m5185WindowInsetsa9UjIt4$default(0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, C2002Dp.m7995constructorimpl(f), 5, null), ComposableLambda3.rememberComposableLambda(-1522021367, true, new AnonymousClass1(MarginAccountUpsellFragment.this), composer2, 54), composer2, 805306374, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: MarginAccountUpsellFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.margin.ui.marginaccount.MarginAccountUpsellFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ MarginAccountUpsellFragment this$0;

                    AnonymousClass1(MarginAccountUpsellFragment marginAccountUpsellFragment) {
                        this.this$0 = marginAccountUpsellFragment;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                        int i2;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i & 6) == 0) {
                            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1522021367, i2, -1, "com.robinhood.android.margin.ui.marginaccount.MarginAccountUpsellFragment.ComposeContent.<anonymous>.<anonymous> (MarginAccountUpsellFragment.kt:61)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierPadding, bentoTheme.getColors(composer, i3).getPrime(), null, 2, null);
                        final MarginAccountUpsellFragment marginAccountUpsellFragment = this.this$0;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, 0);
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM())), bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM());
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor2);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BentoPogKt.BentoPog(new BentoPogState(new BentoPogContent.Pictogram(C20690R.drawable.pict_mono_rds_margin, null, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU()), null), BentoPogDefaults.INSTANCE.getDefaultColors(composer, BentoPogDefaults.$stable), BentoPogSize.Hero, false, false, null, new BentoPogBackgroundOverride.ColorOverride(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), null), 56, null), null, composer, BentoPogState.$stable, 2);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM()), composer, 0);
                        String string2 = marginAccountUpsellFragment.getString(C20999R.string.margin_account_upsell_title, Money.format$default(((MarginAccountUpsellFragmentKey) MarginAccountUpsellFragment.INSTANCE.getArgs((Fragment) marginAccountUpsellFragment)).getCreditAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium();
                        TextAlign.Companion companion4 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8126);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), composer, 0);
                        String string3 = marginAccountUpsellFragment.getString(C20999R.string.gated_options_instant_margin_account_upsell_description);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        BentoText2.m20747BentoText38GnDrw(string3, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8126);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM()), composer, 0);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        String string4 = marginAccountUpsellFragment.getString(C20999R.string.margin_account_upsell_primary_cta);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        BentoButtons.Type type2 = BentoButtons.Type.Primary;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(marginAccountUpsellFragment);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.ui.marginaccount.MarginAccountUpsellFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MarginAccountUpsellFragment.C211021.AnonymousClass1.invoke$lambda$5$lambda$4$lambda$1$lambda$0(marginAccountUpsellFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, string4, modifierFillMaxWidth$default, null, type2, false, false, null, null, null, null, false, null, composer, 24960, 0, 8168);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), composer, 0);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        String string5 = marginAccountUpsellFragment.getString(C20999R.string.margin_account_upsell_secondary_cta);
                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                        BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(marginAccountUpsellFragment);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.margin.ui.marginaccount.MarginAccountUpsellFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MarginAccountUpsellFragment.C211021.AnonymousClass1.invoke$lambda$5$lambda$4$lambda$3$lambda$2(marginAccountUpsellFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, string5, modifierFillMaxWidth$default2, null, type3, false, false, null, null, null, null, false, null, composer, 24960, 0, 8168);
                        composer.endNode();
                        Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, 0);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4$lambda$1$lambda$0(MarginAccountUpsellFragment marginAccountUpsellFragment) {
                        Navigator navigator = marginAccountUpsellFragment.getNavigator();
                        Context contextRequireContext = marginAccountUpsellFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Companion companion = MarginAccountUpsellFragment.INSTANCE;
                        marginAccountUpsellFragment.startActivity(InstantCashUtils.createIntentForMarginUpgrade(navigator, contextRequireContext, InstantCashUtils.getSwitchAccountSassyInputParams(((MarginAccountUpsellFragmentKey) companion.getArgs((Fragment) marginAccountUpsellFragment)).getAccountNumber(), ((MarginAccountUpsellFragmentKey) companion.getArgs((Fragment) marginAccountUpsellFragment)).getBrokerageAccountType(), InstantCashConstants2.SOURCE_MARGIN_ACCOUNT_UPSELL)));
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2(MarginAccountUpsellFragment marginAccountUpsellFragment) {
                        marginAccountUpsellFragment.requireBaseActivity().onBackPressed();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.ui.marginaccount.MarginAccountUpsellFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginAccountUpsellFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: MarginAccountUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/marginaccount/MarginAccountUpsellFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/margin/ui/marginaccount/MarginAccountUpsellFragment;", "Lcom/robinhood/android/margin/contracts/MarginAccountUpsellFragmentKey;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<MarginAccountUpsellFragment, MarginAccountUpsellFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(MarginAccountUpsellFragmentKey marginAccountUpsellFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, marginAccountUpsellFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public MarginAccountUpsellFragmentKey getArgs(MarginAccountUpsellFragment marginAccountUpsellFragment) {
            return (MarginAccountUpsellFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, marginAccountUpsellFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginAccountUpsellFragment newInstance(MarginAccountUpsellFragmentKey marginAccountUpsellFragmentKey) {
            return (MarginAccountUpsellFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, marginAccountUpsellFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginAccountUpsellFragment marginAccountUpsellFragment, MarginAccountUpsellFragmentKey marginAccountUpsellFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, marginAccountUpsellFragment, marginAccountUpsellFragmentKey);
        }
    }
}
