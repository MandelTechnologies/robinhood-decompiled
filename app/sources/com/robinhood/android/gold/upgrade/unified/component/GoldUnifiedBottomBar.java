package com.robinhood.android.gold.upgrade.unified.component;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldUnifiedBottomBar.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a}\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"GoldUnifiedBottomBar", "", "primaryCtaText", "", "onClickPrimaryCta", "Lkotlin/Function0;", "primaryCtaTestTag", "modifier", "Landroidx/compose/ui/Modifier;", "ctaDisclosureMarkdown", "isPrimaryCtaEnabled", "", "isPrimaryCtaLoading", "primaryCtaStyle", "Lcom/robinhood/android/gold/upgrade/unified/component/GoldUnifiedCtaStyle;", "secondaryCtaText", "onClickSecondaryCta", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZLcom/robinhood/android/gold/upgrade/unified/component/GoldUnifiedCtaStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-gold-upgrade_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBarKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedBottomBar {

    /* compiled from: GoldUnifiedBottomBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBarKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoldUnifiedBottomBar3.values().length];
            try {
                iArr[GoldUnifiedBottomBar3.ACHROMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoldUnifiedBottomBar3.GOLD_SPARKLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoldUnifiedBottomBar3.GOLD_STATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUnifiedBottomBar$lambda$5(String str, Function0 function0, String str2, Modifier modifier, String str3, boolean z, boolean z2, GoldUnifiedBottomBar3 goldUnifiedBottomBar3, String str4, Function0 function02, int i, int i2, Composer composer, int i3) {
        GoldUnifiedBottomBar(str, function0, str2, modifier, str3, z, z2, goldUnifiedBottomBar3, str4, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUnifiedBottomBar(final String str, final Function0<Unit> onClickPrimaryCta, final String primaryCtaTestTag, Modifier modifier, String str2, boolean z, boolean z2, GoldUnifiedBottomBar3 goldUnifiedBottomBar3, String str3, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str4;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Function0<Unit> function02;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        String str5;
        BentoTheme bentoTheme;
        int i12;
        Modifier.Companion companion;
        BentoTheme bentoTheme2;
        int i13;
        Function0<Unit> function03;
        String str6;
        boolean z5;
        final String str7;
        final Function0<Unit> function04;
        final String str8;
        Composer composer2;
        final Function0<Unit> function05;
        final Modifier modifier3;
        final GoldUnifiedBottomBar3 goldUnifiedBottomBar32;
        final boolean z6;
        final boolean z7;
        final String str9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClickPrimaryCta, "onClickPrimaryCta");
        Intrinsics.checkNotNullParameter(primaryCtaTestTag, "primaryCtaTestTag");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1197546861);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickPrimaryCta) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(primaryCtaTestTag) ? 256 : 128;
        }
        int i14 = i2 & 8;
        if (i14 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    str4 = str2;
                    i3 |= composerStartRestartGroup.changed(str4) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        z3 = z;
                        i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        z4 = z2;
                    } else {
                        z4 = z2;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                        }
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(goldUnifiedBottomBar3 == null ? -1 : goldUnifiedBottomBar3.ordinal()) ? 8388608 : 4194304;
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i9 = i8;
                            i3 |= composerStartRestartGroup.changed(str3) ? 67108864 : 33554432;
                        }
                        i10 = i2 & 512;
                        if (i10 == 0) {
                            if ((i & 805306368) == 0) {
                                i11 = i10;
                                i3 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
                            }
                            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier4 = i14 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    str4 = null;
                                }
                                boolean z8 = i5 == 0 ? true : z3;
                                if (i6 != 0) {
                                    z4 = false;
                                }
                                GoldUnifiedBottomBar3 goldUnifiedBottomBar33 = i7 == 0 ? GoldUnifiedBottomBar3.GOLD_SPARKLE : goldUnifiedBottomBar3;
                                String str10 = i9 == 0 ? null : str3;
                                if (i11 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBarKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    function02 = (Function0) objRememberedValue2;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function02 = function0;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1197546861, i3, -1, "com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar (GoldUnifiedBottomBar.kt:46)");
                                }
                                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
                                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                int i15 = BentoTheme.$stable;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierNavigationBarsPadding, bentoTheme3.getSpacing(composerStartRestartGroup, i15).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 0), 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                String str11 = str10;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                int i16 = i3;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, str != null ? "" : str, null, 4, null), null, 43, null), true, false, false, true, false, null, 108, null), primaryCtaTestTag);
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBarKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return GoldUnifiedBottomBar.GoldUnifiedBottomBar$lambda$4$lambda$3$lambda$2((SemanticsPropertyReceiver) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue, 1, null), 0.0f, 1, null);
                                composerStartRestartGroup.startReplaceGroup(78432301);
                                if (str4 == null) {
                                    bentoTheme = bentoTheme3;
                                    i12 = i15;
                                    String str12 = str4;
                                    BentoMarkdownText2.BentoMarkdownText(str12, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme3.getTypography(composerStartRestartGroup, i15).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme3.getColors(composerStartRestartGroup, i15).m21426getFg20d7_KjU(), bentoTheme3.getColors(composerStartRestartGroup, i15).m21426getFg20d7_KjU(), false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, ((i16 >> 12) & 14) | (MarkdownStyle.$stable << 6), 26);
                                    str5 = str12;
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i12).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                } else {
                                    str5 = str4;
                                    bentoTheme = bentoTheme3;
                                    i12 = i15;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(78449037);
                                if (str == null) {
                                    int i17 = WhenMappings.$EnumSwitchMapping$0[goldUnifiedBottomBar33.ordinal()];
                                    if (i17 != 1) {
                                        if (i17 == 2) {
                                            companion = companion3;
                                            i13 = i12;
                                            boolean z9 = z4;
                                            composerStartRestartGroup.startReplaceGroup(78462387);
                                            int i18 = i16 >> 3;
                                            boolean z10 = z8;
                                            BentoSparkleButton2.BentoSparkleButton(onClickPrimaryCta, str, modifierFillMaxWidth$default2, null, z10, z9, false, composerStartRestartGroup, ((i16 << 3) & 112) | (i18 & 14) | (57344 & i18) | (i18 & 458752), 72);
                                            z5 = z9;
                                            z8 = z10;
                                            composerStartRestartGroup.endReplaceGroup();
                                            Unit unit = Unit.INSTANCE;
                                            bentoTheme2 = bentoTheme;
                                            function03 = function02;
                                        } else {
                                            if (i17 != 3) {
                                                composerStartRestartGroup.startReplaceGroup(78450329);
                                                composerStartRestartGroup.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composerStartRestartGroup.startReplaceGroup(78472976);
                                            int i19 = i12;
                                            z5 = z4;
                                            Composer composer3 = composerStartRestartGroup;
                                            companion = companion3;
                                            i13 = i19;
                                            BentoButtonKt.BentoGoldButton(onClickPrimaryCta, str, modifierFillMaxWidth$default2, (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, z8, z5, (String) null, composer3, ((i16 >> 3) & 14) | ((i16 << 3) & 112) | (i16 & 458752) | (i16 & 3670016), EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
                                            composerStartRestartGroup = composer3;
                                            composerStartRestartGroup.endReplaceGroup();
                                            Unit unit2 = Unit.INSTANCE;
                                            function03 = function02;
                                            bentoTheme2 = bentoTheme;
                                        }
                                        str6 = str11;
                                    } else {
                                        companion = companion3;
                                        i13 = i12;
                                        z5 = z4;
                                        composerStartRestartGroup.startReplaceGroup(78451980);
                                        Composer composer4 = composerStartRestartGroup;
                                        function03 = function02;
                                        bentoTheme2 = bentoTheme;
                                        str6 = str11;
                                        BentoButtonKt.m20586BentoButtonEikTQX8(onClickPrimaryCta, str, modifierFillMaxWidth$default2, null, null, z8, z5, null, null, null, null, false, null, composer4, ((i16 >> 3) & 14) | ((i16 << 3) & 112) | (i16 & 458752) | (i16 & 3670016), 0, 8088);
                                        composerStartRestartGroup = composer4;
                                        composerStartRestartGroup.endReplaceGroup();
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                } else {
                                    companion = companion3;
                                    bentoTheme2 = bentoTheme;
                                    i13 = i12;
                                    function03 = function02;
                                    str6 = str11;
                                    z5 = z4;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(78482977);
                                str7 = str6;
                                if (str7 == null) {
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i13).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                                    function04 = function03;
                                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2063340865, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBarKt$GoldUnifiedBottomBar$2$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i20) {
                                            if ((i20 & 3) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2063340865, i20, -1, "com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar.<anonymous>.<anonymous> (GoldUnifiedBottomBar.kt:113)");
                                            }
                                            BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                                            BentoButtonKt.m20586BentoButtonEikTQX8(function04, str7, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, type2, false, false, null, null, null, null, false, null, composer5, 24960, 0, 8168);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                                } else {
                                    function04 = function03;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                str8 = str7;
                                composer2 = composerStartRestartGroup;
                                function05 = function04;
                                modifier3 = modifier4;
                                goldUnifiedBottomBar32 = goldUnifiedBottomBar33;
                                z6 = z5;
                                z7 = z8;
                                str9 = str5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                goldUnifiedBottomBar32 = goldUnifiedBottomBar3;
                                function05 = function0;
                                composer2 = composerStartRestartGroup;
                                str9 = str4;
                                str8 = str3;
                                z6 = z4;
                                modifier3 = modifier2;
                                z7 = z3;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBarKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return GoldUnifiedBottomBar.GoldUnifiedBottomBar$lambda$5(str, onClickPrimaryCta, primaryCtaTestTag, modifier3, str9, z7, z6, goldUnifiedBottomBar32, str8, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 805306368;
                        i11 = i10;
                        if ((i3 & 306783379) == 306783378) {
                            if (i14 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier modifierNavigationBarsPadding2 = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
                            BentoTheme bentoTheme32 = BentoTheme.INSTANCE;
                            int i152 = BentoTheme.$stable;
                            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierNavigationBarsPadding2, bentoTheme32.getSpacing(composerStartRestartGroup, i152).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 0), 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            String str112 = str10;
                            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            int i162 = i3;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                Modifier modifierTestTag2 = TestTag3.testTag(ModifiersKt.autoLogEvents$default(companion32, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, str != null ? "" : str, null, 4, null), null, 43, null), true, false, false, true, false, null, 108, null), primaryCtaTestTag);
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(SemanticsModifier6.semantics$default(modifierTestTag2, false, (Function1) objRememberedValue, 1, null), 0.0f, 1, null);
                                composerStartRestartGroup.startReplaceGroup(78432301);
                                if (str4 == null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(78449037);
                                if (str == null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(78482977);
                                str7 = str6;
                                if (str7 == null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                str8 = str7;
                                composer2 = composerStartRestartGroup;
                                function05 = function04;
                                modifier3 = modifier4;
                                goldUnifiedBottomBar32 = goldUnifiedBottomBar33;
                                z6 = z5;
                                z7 = z8;
                                str9 = str5;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i9 = i8;
                    i10 = i2 & 512;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    if ((i3 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z3 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i2 & 512;
                if (i10 == 0) {
                }
                i11 = i10;
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str4 = str2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z3 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i2 & 512;
            if (i10 == 0) {
            }
            i11 = i10;
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        str4 = str2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z3 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i2 & 512;
        if (i10 == 0) {
        }
        i11 = i10;
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUnifiedBottomBar$lambda$4$lambda$3$lambda$2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }
}
