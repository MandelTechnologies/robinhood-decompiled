package com.robinhood.android.creditcard.p091ui.creditapplication.goldagreement;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.ComponentActivity;
import androidx.view.compose.LocalActivity;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.goldagreement.GoldAgreementFragment;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.commonmark.node.Node;

/* compiled from: GoldAgreementFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0006H\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/goldagreement/GoldAgreementFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "duxo", "Lcom/robinhood/android/creditcard/ui/creditapplication/goldagreement/GoldAgreementDuxo;", "getDuxo", "()Lcom/robinhood/android/creditcard/ui/creditapplication/goldagreement/GoldAgreementDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class GoldAgreementFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, GoldAgreementDuxo.class);
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(GoldAgreementFragment goldAgreementFragment, int i, Composer composer, int i2) {
        goldAgreementFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final GoldAgreementDuxo getDuxo() {
        return (GoldAgreementDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(47621417);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(47621417, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementFragment.ComposeContent (GoldAgreementFragment.kt:45)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final String goldAgreementMarkdown = ((Args) INSTANCE.getArgs((Fragment) this)).getGoldAgreementMarkdown();
            Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
            final ComponentActivity componentActivity = objConsume instanceof ComponentActivity ? (ComponentActivity) objConsume : null;
            BentoTheme2.BentoTheme(Boolean.FALSE, null, Boolean.TRUE, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-2139672463, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-2139672463, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementFragment.ComposeContent.<anonymous> (GoldAgreementFragment.kt:50)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU();
                    Unit unit = Unit.INSTANCE;
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(componentActivity) | composer2.changed(jM21371getBg0d7_KjU);
                    ComponentActivity componentActivity2 = componentActivity;
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new GoldAgreementFragment4(componentActivity2, jM21371getBg0d7_KjU, null);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 6);
                    long jM21371getBg0d7_KjU2 = bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU();
                    Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)));
                    final SnapshotState4<GoldAgreementViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    final GoldAgreementFragment goldAgreementFragment = this;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierStatusBarsPadding, ComposableLambda3.rememberComposableLambda(-418687443, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementFragment.ComposeContent.1.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* compiled from: GoldAgreementFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementFragment$ComposeContent$1$2$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ GoldAgreementFragment this$0;

                            AnonymousClass1(GoldAgreementFragment goldAgreementFragment) {
                                this.this$0 = goldAgreementFragment;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(GoldAgreementFragment goldAgreementFragment) {
                                goldAgreementFragment.requireBaseActivity().onBackPressed();
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 6) == 0) {
                                    i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(404533260, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (GoldAgreementFragment.kt:72)");
                                }
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.this$0);
                                final GoldAgreementFragment goldAgreementFragment = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementFragment$ComposeContent$1$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return GoldAgreementFragment.C123931.AnonymousClass2.AnonymousClass1.invoke$lambda$1$lambda$0(goldAgreementFragment);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-418687443, i5, -1, "com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementFragment.ComposeContent.<anonymous>.<anonymous> (GoldAgreementFragment.kt:67)");
                            }
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(GoldAgreementFragment2.INSTANCE.getLambda$1162055904$feature_credit_card_externalDebug(), null, ComposableLambda3.rememberComposableLambda(404533260, true, new AnonymousClass1(goldAgreementFragment), composer3, 54), null, null, false, false, null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i6).m21371getBg0d7_KjU()), 0L, null, composer3, 196998, 0, 1754);
                            if (snapshotState4.getValue().getDisclosureMarkdown() == null) {
                                BentoProgressBar2.m20697BentoIndeterminateProgressBareaDK9VM(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, bentoTheme2.getColors(composer3, i6).m21426getFg20d7_KjU(), 0L, composer3, 6, 10);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(645387842, true, new AnonymousClass3(goldAgreementMarkdown, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 805306416, 316);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: GoldAgreementFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementFragment$ComposeContent$1$3, reason: invalid class name */
                static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ String $goldAgreementMarkdown;
                    final /* synthetic */ SnapshotState4<GoldAgreementViewState> $state;

                    AnonymousClass3(String str, SnapshotState4<GoldAgreementViewState> snapshotState4) {
                        this.$goldAgreementMarkdown = str;
                        this.$state = snapshotState4;
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
                            ComposerKt.traceEventStart(645387842, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementFragment.ComposeContent.<anonymous>.<anonymous> (GoldAgreementFragment.kt:83)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, composer, 0, 1), 0.0f, 1, null);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChanged = composer.changed(this.$goldAgreementMarkdown) | composer.changed(this.$state);
                        final String str = this.$goldAgreementMarkdown;
                        final SnapshotState4<GoldAgreementViewState> snapshotState4 = this.$state;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementFragment$ComposeContent$1$3$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GoldAgreementFragment.C123931.AnonymousClass3.invoke$lambda$1$lambda$0(str, snapshotState4, (LazyListScope) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(final String str, final SnapshotState4 snapshotState4, LazyListScope LazyColumn) {
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1699720983, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementFragment$ComposeContent$1$3$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                invoke(lazyItemScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(LazyItemScope item, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1699720983, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldAgreementFragment.kt:90)");
                                }
                                if (str != null) {
                                    composer.startReplaceGroup(-1276536483);
                                    String str2 = str;
                                    BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    BentoMarkdownText2.BentoMarkdownText(str2, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), 0, 0L, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), false, composer, BentoMarkdownText.$stable << 15, 22), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
                                    composer.endReplaceGroup();
                                } else {
                                    composer.startReplaceGroup(-1276066585);
                                    Node disclosureMarkdown = snapshotState4.getValue().getDisclosureMarkdown();
                                    if (disclosureMarkdown != null) {
                                        BentoMarkdownText bentoMarkdownText2 = BentoMarkdownText.INSTANCE;
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i3 = BentoTheme.$stable;
                                        BentoMarkdownText2.BentoMarkdownText(disclosureMarkdown, (Modifier) null, bentoMarkdownText2.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer, i3).getTextS(), 0, 0L, bentoTheme2.getColors(composer, i3).m21425getFg0d7_KjU(), false, composer, BentoMarkdownText.$stable << 15, 22), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 3, null);
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663686, 250);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldAgreementFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GoldAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/goldagreement/GoldAgreementFragment$Args;", "Landroid/os/Parcelable;", "goldAgreementMarkdown", "", "<init>", "(Ljava/lang/String;)V", "getGoldAgreementMarkdown", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String goldAgreementMarkdown;

        /* compiled from: GoldAgreementFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.goldAgreementMarkdown);
        }

        public Args(String str) {
            this.goldAgreementMarkdown = str;
        }

        public final String getGoldAgreementMarkdown() {
            return this.goldAgreementMarkdown;
        }
    }

    /* compiled from: GoldAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/goldagreement/GoldAgreementFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/creditcard/ui/creditapplication/goldagreement/GoldAgreementFragment;", "Lcom/robinhood/android/creditcard/ui/creditapplication/goldagreement/GoldAgreementFragment$Args;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<GoldAgreementFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(GoldAgreementFragment goldAgreementFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, goldAgreementFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldAgreementFragment newInstance(Args args) {
            return (GoldAgreementFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldAgreementFragment goldAgreementFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, goldAgreementFragment, args);
        }
    }
}
