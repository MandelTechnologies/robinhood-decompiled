package com.robinhood.android.matcha.p177ui.instantwithdrawal;

import android.text.Spannable;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.instantwithdrawal.InstantWithdrawalIntroComposable;
import com.robinhood.android.matcha.p177ui.instantwithdrawal.InstantWithdrawalIntroViewState;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstantWithdrawalIntroComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\u001aU\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0001¢\u0006\u0002\u0010\u000e\u001a3\u0010\u000f\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"FreeInstantWithdrawalIntro", "", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "bullets", "", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState$Loaded$Bullet;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "", "onPayClick", "Lkotlin/Function0;", "onRequestClick", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PayAndRequestFooter", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-p2p_externalDebug", "showFooterDivider", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class InstantWithdrawalIntroComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FreeInstantWithdrawalIntro$lambda$0(Modifier modifier, String str, List list, CharSequence charSequence, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        FreeInstantWithdrawalIntro(modifier, str, list, charSequence, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PayAndRequestFooter$lambda$4(CharSequence charSequence, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        PayAndRequestFooter(charSequence, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: InstantWithdrawalIntroComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroComposableKt$FreeInstantWithdrawalIntro$1 */
    static final class C213941 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ List<InstantWithdrawalIntroViewState.Loaded.Bullet> $bullets;
        final /* synthetic */ CharSequence $disclosure;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onPayClick;
        final /* synthetic */ Function0<Unit> $onRequestClick;
        final /* synthetic */ String $title;

        C213941(Modifier modifier, CharSequence charSequence, Function0<Unit> function0, Function0<Unit> function02, String str, List<InstantWithdrawalIntroViewState.Loaded.Bullet> list) {
            this.$modifier = modifier;
            this.$disclosure = charSequence;
            this.$onPayClick = function0;
            this.$onRequestClick = function02;
            this.$title = str;
            this.$bullets = list;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$1$lambda$0(ScrollState scrollState) {
            return scrollState.getValue() != scrollState.getMaxValue();
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-273093649, i, -1, "com.robinhood.android.matcha.ui.instantwithdrawal.FreeInstantWithdrawalIntro.<anonymous> (InstantWithdrawalIntroComposable.kt:49)");
            }
            final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer, 0, 1);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroComposableKt$FreeInstantWithdrawalIntro$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(InstantWithdrawalIntroComposable.C213941.invoke$lambda$1$lambda$0(scrollStateRememberScrollState));
                    }
                });
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composer.endReplaceGroup();
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            final CharSequence charSequence = this.$disclosure;
            final Function0<Unit> function0 = this.$onPayClick;
            final Function0<Unit> function02 = this.$onRequestClick;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-252721820, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroComposableKt.FreeInstantWithdrawalIntro.1.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i2 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-252721820, i2, -1, "com.robinhood.android.matcha.ui.instantwithdrawal.FreeInstantWithdrawalIntro.<anonymous>.<anonymous> (InstantWithdrawalIntroComposable.kt:87)");
                    }
                    CharSequence charSequence2 = charSequence;
                    Function0<Unit> function03 = function0;
                    Function0<Unit> function04 = function02;
                    SnapshotState4<Boolean> snapshotState42 = snapshotState4;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composer2.startReplaceGroup(2065507050);
                    if (C213941.invoke$lambda$2(snapshotState42)) {
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU(), 0.0f, composer2, 0, 5);
                    }
                    composer2.endReplaceGroup();
                    InstantWithdrawalIntroComposable.PayAndRequestFooter(charSequence2, function03, function04, composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54);
            final String str = this.$title;
            final List<InstantWithdrawalIntroViewState.Loaded.Bullet> list = this.$bullets;
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierM4872backgroundbw27NRU$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-371297065, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroComposableKt.FreeInstantWithdrawalIntro.1.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i2) {
                    List<InstantWithdrawalIntroViewState.Loaded.Bullet> list2;
                    Composer composer3;
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i2 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-371297065, i2, -1, "com.robinhood.android.matcha.ui.instantwithdrawal.FreeInstantWithdrawalIntro.<anonymous>.<anonymous> (InstantWithdrawalIntroComposable.kt:60)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, scrollStateRememberScrollState, false, null, false, 14, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    String str2 = str;
                    List<InstantWithdrawalIntroViewState.Loaded.Bullet> list3 = list;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    ImageKt.Image(PainterResources_androidKt.painterResource(C21284R.drawable.svg_incentives_learn_more, composer2, 0), (String) null, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    composer2.startReplaceGroup(874563936);
                    if (str2 == null) {
                        composer3 = composer2;
                        list2 = list3;
                    } else {
                        list2 = list3;
                        composer3 = composer2;
                        BentoText2.m20747BentoText38GnDrw(str2, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), composer2, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getDisplayCapsuleLarge(), composer3, 0, 0, 8188);
                    }
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(874574743);
                    for (InstantWithdrawalIntroViewState.Loaded.Bullet bullet : list2) {
                        BentoValuePropRow3.BentoValuePropRow(bullet.getTitle(), bullet.getBody(), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, 2, null), BentoValuePropRow.Top, (Modifier) null, composer3, (BentoValuePropRow2.Icon.$stable << 6) | 3072, 16);
                        composer3 = composer2;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$2(SnapshotState4<Boolean> snapshotState4) {
            return snapshotState4.getValue().booleanValue();
        }
    }

    public static final void FreeInstantWithdrawalIntro(Modifier modifier, final String str, final List<InstantWithdrawalIntroViewState.Loaded.Bullet> bullets, final CharSequence charSequence, final Function0<Unit> onPayClick, final Function0<Unit> onRequestClick, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(bullets, "bullets");
        Intrinsics.checkNotNullParameter(onPayClick, "onPayClick");
        Intrinsics.checkNotNullParameter(onRequestClick, "onRequestClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1006609178);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(bullets) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(charSequence) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPayClick) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRequestClick) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1006609178, i3, -1, "com.robinhood.android.matcha.ui.instantwithdrawal.FreeInstantWithdrawalIntro (InstantWithdrawalIntroComposable.kt:47)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-273093649, true, new C213941(modifier2, charSequence, onPayClick, onRequestClick, str, bullets), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstantWithdrawalIntroComposable.FreeInstantWithdrawalIntro$lambda$0(modifier2, str, bullets, charSequence, onPayClick, onRequestClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PayAndRequestFooter(final CharSequence charSequence, Function0<Unit> onPayClick, Function0<Unit> onRequestClick, Composer composer, final int i) {
        int i2;
        int i3;
        Alignment.Companion companion;
        float f;
        Modifier.Companion companion2;
        int i4;
        BentoTheme bentoTheme;
        int i5;
        final Function0<Unit> function0;
        final Function0<Unit> function02;
        Intrinsics.checkNotNullParameter(onPayClick, "onPayClick");
        Intrinsics.checkNotNullParameter(onRequestClick, "onRequestClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1598249701);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPayClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRequestClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = onPayClick;
            function02 = onRequestClick;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1598249701, i2, -1, "com.robinhood.android.matcha.ui.instantwithdrawal.PayAndRequestFooter (InstantWithdrawalIntroComposable.kt:107)");
            }
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
            composerStartRestartGroup.startReplaceGroup(-735257638);
            if (spannable == null) {
                companion = companion3;
                i3 = i2;
                companion2 = companion4;
                bentoTheme = bentoTheme2;
                i4 = i6;
                i5 = 1;
                f = 0.0f;
            } else {
                i3 = i2;
                companion = companion3;
                f = 0.0f;
                companion2 = companion4;
                i4 = i6;
                bentoTheme = bentoTheme2;
                i5 = 1;
                BentoSpannedText.m21106BentoSpannedTextTHkziT8(spannable, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), C20690R.attr.textAppearanceRegularSmall, 17, 0, 0, null, composerStartRestartGroup, 196608, 450);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, f, i5, null);
            BentoTheme bentoTheme3 = bentoTheme;
            int i7 = i4;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier.Companion companion6 = companion2;
            Modifier modifierWeight$default = Row5.weight$default(row6, companion6, 1.0f, false, 2, null);
            String strStringResource = StringResources_androidKt.stringResource(C21284R.string.matcha_transfer_pay, composerStartRestartGroup, 0);
            BentoButtons.Icon.Size16 size16 = new BentoButtons.Icon.Size16(ServerToBentoAssetMapper2.WITHDRAW_24, null, 2, null);
            int i8 = BentoButtons.Icon.Size16.$stable;
            BentoButtonKt.m20586BentoButtonEikTQX8(onPayClick, strStringResource, modifierWeight$default, size16, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i3 >> 3) & 14) | (i8 << 9), 0, 8176);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion6, bentoTheme3.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            function0 = onPayClick;
            function02 = onRequestClick;
            BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C21284R.string.matcha_transfer_request, composerStartRestartGroup, 0), Row5.weight$default(row6, companion6, 1.0f, false, 2, null), new BentoButtons.Icon.Size16(ServerToBentoAssetMapper2.DEPOSIT_24, null, 2, null), null, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i3 >> 6) & 14) | (i8 << 9), 0, 8176);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstantWithdrawalIntroComposable.PayAndRequestFooter$lambda$4(charSequence, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
