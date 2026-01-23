package com.robinhood.android.gold.upgrade.legacy;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.component.text.Markdown3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.text.Spans;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: LegacyGoldUpgradeAgreementsComposable.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0002\u0010\b\u001a\u0090\u0001\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00070\r28\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\u0010\u001b\u001a3\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0017\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\"\"\u0016\u0010\u001c\u001a\u00020\u00048\u0000X\u0081D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0013X\u008a\u008e\u0002"}, m3636d2 = {"rememberDescription", "Landroid/text/Spanned;", "markdownSpanned", AccountOverviewOptionsSettingCard4.CTA, "", "onClickCta", "Lkotlin/Function0;", "", "(Landroid/text/Spanned;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroid/text/Spanned;", "GoldUpgradeAgreementsComposable", "goldSweepAgreements", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "onClickAgreement", "Lkotlin/Function1;", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "Lkotlin/ParameterName;", "name", "agreement", "Lkotlin/Function2;", "", "isSweepChecked", "Ljava/util/UUID;", "selectedPlanId", "showSparkleButton", "isTitleCenterAlignment", "duxo", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeAgreementsDuxo;", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ZZLcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeAgreementsDuxo;Landroidx/compose/runtime/Composer;II)V", "ctaTestTag", "getCtaTestTag", "()Ljava/lang/String;", "ButtonBar", "ctaText", "disclaimerMarkdown", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "feature-gold-upgrade_externalRelease", "viewState", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeAgreementsViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeAgreementsComposable {
    private static final String ctaTestTag = "GoldUpgradeAgreementsCta";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonBar$lambda$17(String str, String str2, Function0 function0, boolean z, int i, Composer composer, int i2) {
        ButtonBar(str, str2, function0, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeAgreementsComposable$lambda$13(ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements, Function1 function1, Function2 function2, boolean z, boolean z2, LegacyGoldUpgradeAgreementsDuxo legacyGoldUpgradeAgreementsDuxo, int i, int i2, Composer composer, int i3) {
        GoldUpgradeAgreementsComposable(apiGoldSweepAgreements, function1, function2, z, z2, legacyGoldUpgradeAgreementsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Spanned rememberDescription(Spanned markdownSpanned, String str, final Function0<Unit> onClickCta, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(markdownSpanned, "markdownSpanned");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        composer.startReplaceGroup(1991566172);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1991566172, i, -1, "com.robinhood.android.gold.upgrade.legacy.rememberDescription (LegacyGoldUpgradeAgreementsComposable.kt:56)");
        }
        composer.startReplaceGroup(-1633490746);
        final boolean z = true;
        boolean zChanged = ((((i & 112) ^ 48) > 32 && composer.changed(str)) || (i & 48) == 32) | composer.changed(markdownSpanned);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) markdownSpanned);
            if (str != null) {
                spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
                Spans spans = Spans.INSTANCE;
                ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$rememberDescription$lambda$2$lambda$1$lambda$0$$inlined$appendClickableSpan$default$1
                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint textPaint) {
                        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
                        textPaint.setColor(textPaint.linkColor);
                        textPaint.setUnderlineText(z);
                        if (z) {
                            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                        }
                    }

                    @Override // android.text.style.ClickableSpan
                    public void onClick(View widget) {
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        onClickCta.invoke();
                    }
                };
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.setSpan(clickableSpan, length, spannableStringBuilder.length(), 17);
            }
            objRememberedValue = SpannedString.valueOf(new SpannedString(spannableStringBuilder));
            composer.updateRememberedValue(objRememberedValue);
        }
        Spanned spanned = (Spanned) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return spanned;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUpgradeAgreementsComposable(final ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements, final Function1<? super ApiGoldSweepAgreement, Unit> onClickAgreement, final Function2<? super Boolean, ? super UUID, Unit> onClickCta, boolean z, boolean z2, LegacyGoldUpgradeAgreementsDuxo legacyGoldUpgradeAgreementsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        LegacyGoldUpgradeAgreementsDuxo legacyGoldUpgradeAgreementsDuxo2;
        boolean z5;
        boolean z6;
        int i5;
        int i6;
        LegacyGoldUpgradeAgreementsDuxo legacyGoldUpgradeAgreementsDuxo3;
        Object objRememberedValue;
        Composer.Companion companion;
        int i7;
        Object objRememberedValue2;
        int i8;
        Object objRememberedValue3;
        final boolean z7;
        final LegacyGoldUpgradeAgreementsDuxo legacyGoldUpgradeAgreementsDuxo4;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(goldSweepAgreements, "goldSweepAgreements");
        Intrinsics.checkNotNullParameter(onClickAgreement, "onClickAgreement");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(-867888808);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(goldSweepAgreements) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickAgreement) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickCta) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        legacyGoldUpgradeAgreementsDuxo2 = legacyGoldUpgradeAgreementsDuxo;
                        int i10 = composerStartRestartGroup.changedInstance(legacyGoldUpgradeAgreementsDuxo2) ? 131072 : 65536;
                        i3 |= i10;
                    } else {
                        legacyGoldUpgradeAgreementsDuxo2 = legacyGoldUpgradeAgreementsDuxo;
                    }
                    i3 |= i10;
                } else {
                    legacyGoldUpgradeAgreementsDuxo2 = legacyGoldUpgradeAgreementsDuxo;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    z8 = z3;
                    z7 = z4;
                    legacyGoldUpgradeAgreementsDuxo4 = legacyGoldUpgradeAgreementsDuxo2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        z5 = i9 == 0 ? true : z3;
                        z6 = i4 == 0 ? false : z4;
                        if ((i2 & 32) == 0) {
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            i5 = 0;
                            i6 = -1633490746;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LegacyGoldUpgradeAgreementsDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$GoldUpgradeAgreementsComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$GoldUpgradeAgreementsComposable$$inlined$duxo$1.1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                            }
                                        };
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            i3 &= -458753;
                            legacyGoldUpgradeAgreementsDuxo3 = (LegacyGoldUpgradeAgreementsDuxo) baseDuxo;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-867888808, i3, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeAgreementsComposable (LegacyGoldUpgradeAgreementsComposable.kt:75)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(legacyGoldUpgradeAgreementsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        Object[] objArr = new Object[i5];
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LegacyGoldUpgradeAgreementsComposable.GoldUpgradeAgreementsComposable$lambda$5$lambda$4();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                        Spanned spannedRememberMarkdown = Markdown3.rememberMarkdown(goldSweepAgreements.getGoldDescriptionMarkdown(), composerStartRestartGroup, i5);
                        String goldDescriptionCta = goldSweepAgreements.getGoldDescriptionCta();
                        composerStartRestartGroup.startReplaceGroup(i6);
                        int i11 = i3 & 112;
                        i7 = (i11 == 32 ? 1 : i5) | (composerStartRestartGroup.changedInstance(goldSweepAgreements) ? 1 : 0);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (i7 != 0 || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LegacyGoldUpgradeAgreementsComposable.GoldUpgradeAgreementsComposable$lambda$12$lambda$9$lambda$8(onClickAgreement, goldSweepAgreements);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Spanned spannedRememberDescription = rememberDescription(spannedRememberMarkdown, goldDescriptionCta, (Function0) objRememberedValue2, composerStartRestartGroup, i5);
                        Spanned spannedRememberMarkdown2 = Markdown3.rememberMarkdown(goldSweepAgreements.getSweepDescriptionMarkdown(), composerStartRestartGroup, i5);
                        String sweepDescriptionCta = goldSweepAgreements.getSweepDescriptionCta();
                        composerStartRestartGroup.startReplaceGroup(i6);
                        i8 = (i11 != 32 ? 1 : i5) | (composerStartRestartGroup.changedInstance(goldSweepAgreements) ? 1 : 0);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (i8 == 0 || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LegacyGoldUpgradeAgreementsComposable.GoldUpgradeAgreementsComposable$lambda$12$lambda$11$lambda$10(onClickAgreement, goldSweepAgreements);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Spanned spannedRememberDescription2 = rememberDescription(spannedRememberMarkdown2, sweepDescriptionCta, (Function0) objRememberedValue3, composerStartRestartGroup, i5);
                        boolean z9 = z5;
                        boolean z10 = z6;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-1548014774, true, new LegacyGoldUpgradeAgreementsComposable2(goldSweepAgreements, onClickCta, snapshotState, snapshotState4CollectAsStateWithLifecycle, z9), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-891897283, true, new LegacyGoldUpgradeAgreementsComposable3(snapshotState, spannedRememberDescription2, z10, goldSweepAgreements, spannedRememberDescription), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z7 = z10;
                        legacyGoldUpgradeAgreementsDuxo4 = legacyGoldUpgradeAgreementsDuxo3;
                        z8 = z9;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        z5 = z3;
                        z6 = z4;
                    }
                    i6 = -1633490746;
                    i5 = 0;
                    legacyGoldUpgradeAgreementsDuxo3 = legacyGoldUpgradeAgreementsDuxo2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(legacyGoldUpgradeAgreementsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Object[] objArr2 = new Object[i5];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                    Spanned spannedRememberMarkdown3 = Markdown3.rememberMarkdown(goldSweepAgreements.getGoldDescriptionMarkdown(), composerStartRestartGroup, i5);
                    String goldDescriptionCta2 = goldSweepAgreements.getGoldDescriptionCta();
                    composerStartRestartGroup.startReplaceGroup(i6);
                    int i112 = i3 & 112;
                    i7 = (i112 == 32 ? 1 : i5) | (composerStartRestartGroup.changedInstance(goldSweepAgreements) ? 1 : 0);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (i7 != 0) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LegacyGoldUpgradeAgreementsComposable.GoldUpgradeAgreementsComposable$lambda$12$lambda$9$lambda$8(onClickAgreement, goldSweepAgreements);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Spanned spannedRememberDescription3 = rememberDescription(spannedRememberMarkdown3, goldDescriptionCta2, (Function0) objRememberedValue2, composerStartRestartGroup, i5);
                        Spanned spannedRememberMarkdown22 = Markdown3.rememberMarkdown(goldSweepAgreements.getSweepDescriptionMarkdown(), composerStartRestartGroup, i5);
                        String sweepDescriptionCta2 = goldSweepAgreements.getSweepDescriptionCta();
                        composerStartRestartGroup.startReplaceGroup(i6);
                        i8 = (i112 != 32 ? 1 : i5) | (composerStartRestartGroup.changedInstance(goldSweepAgreements) ? 1 : 0);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (i8 == 0) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LegacyGoldUpgradeAgreementsComposable.GoldUpgradeAgreementsComposable$lambda$12$lambda$11$lambda$10(onClickAgreement, goldSweepAgreements);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            Spanned spannedRememberDescription22 = rememberDescription(spannedRememberMarkdown22, sweepDescriptionCta2, (Function0) objRememberedValue3, composerStartRestartGroup, i5);
                            boolean z92 = z5;
                            boolean z102 = z6;
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-1548014774, true, new LegacyGoldUpgradeAgreementsComposable2(goldSweepAgreements, onClickCta, snapshotState2, snapshotState4CollectAsStateWithLifecycle2, z92), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-891897283, true, new LegacyGoldUpgradeAgreementsComposable3(snapshotState2, spannedRememberDescription22, z102, goldSweepAgreements, spannedRememberDescription3), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z7 = z102;
                            legacyGoldUpgradeAgreementsDuxo4 = legacyGoldUpgradeAgreementsDuxo3;
                            z8 = z92;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LegacyGoldUpgradeAgreementsComposable.GoldUpgradeAgreementsComposable$lambda$13(goldSweepAgreements, onClickAgreement, onClickCta, z8, z7, legacyGoldUpgradeAgreementsDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            z4 = z2;
            if ((196608 & i) == 0) {
            }
            if ((74899 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 32) == 0) {
                        i6 = -1633490746;
                        i5 = 0;
                        legacyGoldUpgradeAgreementsDuxo3 = legacyGoldUpgradeAgreementsDuxo2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(legacyGoldUpgradeAgreementsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Object[] objArr22 = new Object[i5];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SnapshotState snapshotState22 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                    Spanned spannedRememberMarkdown32 = Markdown3.rememberMarkdown(goldSweepAgreements.getGoldDescriptionMarkdown(), composerStartRestartGroup, i5);
                    String goldDescriptionCta22 = goldSweepAgreements.getGoldDescriptionCta();
                    composerStartRestartGroup.startReplaceGroup(i6);
                    int i1122 = i3 & 112;
                    i7 = (i1122 == 32 ? 1 : i5) | (composerStartRestartGroup.changedInstance(goldSweepAgreements) ? 1 : 0);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (i7 != 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        z4 = z2;
        if ((196608 & i) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState GoldUpgradeAgreementsComposable$lambda$5$lambda$4() {
        return SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GoldUpgradeAgreementsComposable$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeAgreementsComposable$lambda$12$lambda$9$lambda$8(Function1 function1, ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements) {
        function1.invoke(apiGoldSweepAgreements.getGoldFullAgreement());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyGoldUpgradeAgreementsViewState GoldUpgradeAgreementsComposable$lambda$3(SnapshotState4<LegacyGoldUpgradeAgreementsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GoldUpgradeAgreementsComposable$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeAgreementsComposable$lambda$12$lambda$11$lambda$10(Function1 function1, ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements) {
        function1.invoke(apiGoldSweepAgreements.getSweepFullAgreement());
        return Unit.INSTANCE;
    }

    public static final String getCtaTestTag() {
        return ctaTestTag;
    }

    public static final void ButtonBar(final String ctaText, final String disclaimerMarkdown, final Function0<Unit> onClickCta, final boolean z, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(disclaimerMarkdown, "disclaimerMarkdown");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2099135485);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(ctaText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(disclaimerMarkdown) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickCta) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2099135485, i2, -1, "com.robinhood.android.gold.upgrade.legacy.ButtonBar (LegacyGoldUpgradeAgreementsComposable.kt:195)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            int i4 = i2;
            BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(disclaimerMarkdown, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU()), null, C20690R.attr.textAppearanceRegularSmall, 1, 0, 0, null, composerStartRestartGroup, ((i2 >> 3) & 14) | 196656, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, "Agree", null, 4, null), null, 43, null), true, false, false, true, false, null, 108, null), ctaTestTag);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LegacyGoldUpgradeAgreementsComposable.ButtonBar$lambda$16$lambda$15$lambda$14((SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue, 1, null);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(33513371);
                BentoSparkleButton2.BentoSparkleButton(onClickCta, ctaText, SizeKt.fillMaxWidth$default(modifierSemantics$default, 0.0f, 1, null), null, false, false, false, composerStartRestartGroup, ((i4 >> 6) & 14) | ((i4 << 3) & 112), 120);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(33640130);
                BentoButtonKt.m20586BentoButtonEikTQX8(onClickCta, ctaText, SizeKt.fillMaxWidth$default(modifierSemantics$default, 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i4 >> 6) & 14) | ((i4 << 3) & 112), 0, 8184);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeAgreementsComposable.ButtonBar$lambda$17(ctaText, disclaimerMarkdown, onClickCta, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonBar$lambda$16$lambda$15$lambda$14(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }
}
