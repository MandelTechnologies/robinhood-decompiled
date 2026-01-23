package com.robinhood.android.creditcard.p091ui.creditapplication.incentive.bonus.points;

import android.content.res.Resources;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheet;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BonusPointsModalBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"BonusPointsModalBottomSheet", "", "variant", "Lcom/robinhood/android/creditcard/ui/creditapplication/incentive/bonus/points/BonusPointsTextVariant;", "onDismissRequest", "Lkotlin/Function0;", "openTermsUrl", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/creditcard/ui/creditapplication/incentive/bonus/points/BonusPointsTextVariant;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheetKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class BonusPointsModalBottomSheet {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BonusPointsModalBottomSheet$lambda$0(BonusPointsTextVariant bonusPointsTextVariant, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BonusPointsModalBottomSheet(bonusPointsTextVariant, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BonusPointsModalBottomSheet(final BonusPointsTextVariant variant, final Function0<Unit> onDismissRequest, final Function1<? super String, Unit> openTermsUrl, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(openTermsUrl, "openTermsUrl");
        Composer composerStartRestartGroup = composer.startRestartGroup(1987842511);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(variant.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(openTermsUrl) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1987842511, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheet (BonusPointsModalBottomSheet.kt:39)");
                }
                final String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_card_app_bonus_points_link, composerStartRestartGroup, 0);
                Modifier modifier5 = modifier4;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismissRequest, modifier5, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1192530200, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheetKt.BonusPointsModalBottomSheet.1

                    /* compiled from: BonusPointsModalBottomSheet.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheetKt$BonusPointsModalBottomSheet$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $onDismissRequest;
                        final /* synthetic */ Function1<String, Unit> $openTermsUrl;
                        final /* synthetic */ String $termsUrl;
                        final /* synthetic */ BonusPointsTextVariant $variant;

                        /* compiled from: BonusPointsModalBottomSheet.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheetKt$BonusPointsModalBottomSheet$1$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[BonusPointsTextVariant.values().length];
                                try {
                                    iArr[BonusPointsTextVariant.BONUS_POINTS_10K.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[BonusPointsTextVariant.BONUS_POINTS_15K.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[BonusPointsTextVariant.BONUS_POINTS_20K.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(BonusPointsTextVariant bonusPointsTextVariant, Function1<? super String, Unit> function1, String str, Function0<Unit> function0) {
                            this.$variant = bonusPointsTextVariant;
                            this.$openTermsUrl = function1;
                            this.$termsUrl = str;
                            this.$onDismissRequest = function0;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(DrawScope drawBehind) {
                            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                            DrawScope.m6957drawRectAsUm42w$default(drawBehind, Brush.Companion.m6683verticalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{new Tuples2(Float.valueOf(0.0f), Color.m6701boximpl(BentoColor.INSTANCE.m21140getCCGoldBG20d7_KjU())), new Tuples2(Float.valueOf(1.0f), Color.m6701boximpl(Color2.Color(4280097038L)))}, 0.0f, 0.0f, 0, 14, (Object) null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                            BoxScopeInstance boxScopeInstance;
                            BonusPointsTextVariant bonusPointsTextVariant;
                            Object obj;
                            char c;
                            int i2;
                            String str;
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1300964704, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheet.<anonymous>.<anonymous> (BonusPointsModalBottomSheet.kt:46)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer.rememberedValue();
                            Composer.Companion companion2 = Composer.INSTANCE;
                            if (objRememberedValue == companion2.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheetKt$BonusPointsModalBottomSheet$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return BonusPointsModalBottomSheet.C124451.AnonymousClass1.invoke$lambda$1$lambda$0((DrawScope) obj2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(DrawModifierKt.drawBehind(modifierFillMaxWidth$default, (Function1) objRememberedValue), 0.0f, composer, 0, 1);
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                            BonusPointsTextVariant bonusPointsTextVariant2 = this.$variant;
                            final Function1<String, Unit> function1 = this.$openTermsUrl;
                            final String str2 = this.$termsUrl;
                            Function0<Unit> function0 = this.$onDismissRequest;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE)), C2002Dp.m7995constructorimpl(21));
                            AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_rh_gold_card_logo_alternative), null, null, null, 0, null, composer, 0, 62);
                            ContentScale.Companion companion5 = ContentScale.INSTANCE;
                            ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, modifierM5156height3ABfNKs, (Alignment) null, companion5.getFit(), 0.0f, (ColorFilter) null, composer, 24624, 104);
                            Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 1, null), 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5156height3ABfNKs2);
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            composer.startReplaceGroup(1429933602);
                            if (bonusPointsTextVariant2 != BonusPointsTextVariant.BONUS_POINTS_10K) {
                                boxScopeInstance = boxScopeInstance2;
                                bonusPointsTextVariant = bonusPointsTextVariant2;
                                obj = null;
                                ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.bonus_points_background), null, null, null, 0, null, composer, 0, 62), (String) null, boxScopeInstance2.align(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), companion3.getBottomCenter()), (Alignment) null, companion5.getFit(), 0.0f, (ColorFilter) null, composer, 24624, 104);
                            } else {
                                boxScopeInstance = boxScopeInstance2;
                                bonusPointsTextVariant = bonusPointsTextVariant2;
                                obj = null;
                            }
                            composer.endReplaceGroup();
                            Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxSize$default(companion, 0.0f, 1, obj), companion3.getTopCenter());
                            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                            int i4 = iArr[bonusPointsTextVariant.ordinal()];
                            if (i4 != 1) {
                                c = 2;
                                if (i4 == 2) {
                                    i2 = C12201R.drawable.bonus_points_15k;
                                } else {
                                    if (i4 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i2 = C12201R.drawable.bonus_points_20k;
                                }
                            } else {
                                c = 2;
                                i2 = C12201R.drawable.bonus_points_10k;
                            }
                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(i2), null, null, null, 0, null, composer, 0, 62), (String) null, modifierAlign, (Alignment) null, companion5.getFit(), 0.0f, (ColorFilter) null, composer, 24624, 104);
                            composer.endNode();
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj);
                            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_card_app_bonus_points_title, composer, 0);
                            TextAlign.Companion companion6 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default2, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextL(), composer, 48, 0, 8120);
                            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null);
                            int i5 = C12201R.string.credit_card_app_bonus_points_subtitle;
                            int i6 = iArr[bonusPointsTextVariant.ordinal()];
                            if (i6 == 1) {
                                str = "10K";
                            } else if (i6 == 2) {
                                str = "15K";
                            } else {
                                if (i6 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "20K";
                            }
                            String strStringResource2 = StringResources_androidKt.stringResource(i5, new Object[]{str}, composer, 0);
                            String strStringResource3 = StringResources_androidKt.stringResource(C12201R.string.credit_card_app_bonus_points_subtitle_link_text, composer, 0);
                            int iM7919getCentere0LSkKk = companion6.m7919getCentere0LSkKk();
                            TextStyle textM = bentoTheme.getTypography(composer, i3).getTextM();
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged = composer.changed(function1) | composer.changed(str2);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheetKt$BonusPointsModalBottomSheet$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return BonusPointsModalBottomSheet.C124451.AnonymousClass1.invoke$lambda$5$lambda$4$lambda$3(function1, str2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource2, strStringResource3, (Function0) objRememberedValue2, modifierM5144paddingVpY3zN4$default, jM21426getFg20d7_KjU, 0L, textM, iM7919getCentere0LSkKk, composer, 0, 32);
                            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0), SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), 0.0f, 1, null), null, null, false, false, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, false, null, composer, 0, 0, 8056);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4$lambda$3(Function1 function1, String str) {
                            function1.invoke(str);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                        invoke(rhModalBottomSheet5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1192530200, i5, -1, "com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheet.<anonymous> (BonusPointsModalBottomSheet.kt:45)");
                        }
                        BentoTheme2.BentoTheme(Boolean.FALSE, null, Boolean.TRUE, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1300964704, true, new AnonymousClass1(variant, openTermsUrl, strStringResource, onDismissRequest), composer2, 54), composer2, 100663686, 250);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 1572864 | ((i3 >> 6) & 112), 60);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BonusPointsModalBottomSheet.BonusPointsModalBottomSheet$lambda$0(variant, onDismissRequest, openTermsUrl, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.credit_card_app_bonus_points_link, composerStartRestartGroup, 0);
            Modifier modifier52 = modifier4;
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismissRequest, modifier52, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1192530200, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheetKt.BonusPointsModalBottomSheet.1

                /* compiled from: BonusPointsModalBottomSheet.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheetKt$BonusPointsModalBottomSheet$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Function0<Unit> $onDismissRequest;
                    final /* synthetic */ Function1<String, Unit> $openTermsUrl;
                    final /* synthetic */ String $termsUrl;
                    final /* synthetic */ BonusPointsTextVariant $variant;

                    /* compiled from: BonusPointsModalBottomSheet.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheetKt$BonusPointsModalBottomSheet$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[BonusPointsTextVariant.values().length];
                            try {
                                iArr[BonusPointsTextVariant.BONUS_POINTS_10K.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[BonusPointsTextVariant.BONUS_POINTS_15K.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[BonusPointsTextVariant.BONUS_POINTS_20K.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(BonusPointsTextVariant bonusPointsTextVariant, Function1<? super String, Unit> function1, String str, Function0<Unit> function0) {
                        this.$variant = bonusPointsTextVariant;
                        this.$openTermsUrl = function1;
                        this.$termsUrl = str;
                        this.$onDismissRequest = function0;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(DrawScope drawBehind) {
                        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                        DrawScope.m6957drawRectAsUm42w$default(drawBehind, Brush.Companion.m6683verticalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{new Tuples2(Float.valueOf(0.0f), Color.m6701boximpl(BentoColor.INSTANCE.m21140getCCGoldBG20d7_KjU())), new Tuples2(Float.valueOf(1.0f), Color.m6701boximpl(Color2.Color(4280097038L)))}, 0.0f, 0.0f, 0, 14, (Object) null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                        BoxScopeInstance boxScopeInstance;
                        BonusPointsTextVariant bonusPointsTextVariant;
                        Object obj;
                        char c;
                        int i2;
                        String str;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1300964704, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheet.<anonymous>.<anonymous> (BonusPointsModalBottomSheet.kt:46)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion2 = Composer.INSTANCE;
                        if (objRememberedValue == companion2.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheetKt$BonusPointsModalBottomSheet$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return BonusPointsModalBottomSheet.C124451.AnonymousClass1.invoke$lambda$1$lambda$0((DrawScope) obj2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(DrawModifierKt.drawBehind(modifierFillMaxWidth$default, (Function1) objRememberedValue), 0.0f, composer, 0, 1);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                        BonusPointsTextVariant bonusPointsTextVariant2 = this.$variant;
                        final Function1 function1 = this.$openTermsUrl;
                        final String str2 = this.$termsUrl;
                        Function0<Unit> function0 = this.$onDismissRequest;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE)), C2002Dp.m7995constructorimpl(21));
                        AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_rh_gold_card_logo_alternative), null, null, null, 0, null, composer, 0, 62);
                        ContentScale.Companion companion5 = ContentScale.INSTANCE;
                        ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, modifierM5156height3ABfNKs, (Alignment) null, companion5.getFit(), 0.0f, (ColorFilter) null, composer, 24624, 104);
                        Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 1, null), 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5156height3ABfNKs2);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composer.startReplaceGroup(1429933602);
                        if (bonusPointsTextVariant2 != BonusPointsTextVariant.BONUS_POINTS_10K) {
                            boxScopeInstance = boxScopeInstance2;
                            bonusPointsTextVariant = bonusPointsTextVariant2;
                            obj = null;
                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.bonus_points_background), null, null, null, 0, null, composer, 0, 62), (String) null, boxScopeInstance2.align(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), companion3.getBottomCenter()), (Alignment) null, companion5.getFit(), 0.0f, (ColorFilter) null, composer, 24624, 104);
                        } else {
                            boxScopeInstance = boxScopeInstance2;
                            bonusPointsTextVariant = bonusPointsTextVariant2;
                            obj = null;
                        }
                        composer.endReplaceGroup();
                        Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxSize$default(companion, 0.0f, 1, obj), companion3.getTopCenter());
                        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                        int i4 = iArr[bonusPointsTextVariant.ordinal()];
                        if (i4 != 1) {
                            c = 2;
                            if (i4 == 2) {
                                i2 = C12201R.drawable.bonus_points_15k;
                            } else {
                                if (i4 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i2 = C12201R.drawable.bonus_points_20k;
                            }
                        } else {
                            c = 2;
                            i2 = C12201R.drawable.bonus_points_10k;
                        }
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(i2), null, null, null, 0, null, composer, 0, 62), (String) null, modifierAlign, (Alignment) null, companion5.getFit(), 0.0f, (ColorFilter) null, composer, 24624, 104);
                        composer.endNode();
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj);
                        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_card_app_bonus_points_title, composer, 0);
                        TextAlign.Companion companion6 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default2, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextL(), composer, 48, 0, 8120);
                        Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null);
                        int i5 = C12201R.string.credit_card_app_bonus_points_subtitle;
                        int i6 = iArr[bonusPointsTextVariant.ordinal()];
                        if (i6 == 1) {
                            str = "10K";
                        } else if (i6 == 2) {
                            str = "15K";
                        } else {
                            if (i6 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "20K";
                        }
                        String strStringResource2 = StringResources_androidKt.stringResource(i5, new Object[]{str}, composer, 0);
                        String strStringResource3 = StringResources_androidKt.stringResource(C12201R.string.credit_card_app_bonus_points_subtitle_link_text, composer, 0);
                        int iM7919getCentere0LSkKk = companion6.m7919getCentere0LSkKk();
                        TextStyle textM = bentoTheme.getTypography(composer, i3).getTextM();
                        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU();
                        composer.startReplaceGroup(-1633490746);
                        boolean zChanged = composer.changed(function1) | composer.changed(str2);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheetKt$BonusPointsModalBottomSheet$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return BonusPointsModalBottomSheet.C124451.AnonymousClass1.invoke$lambda$5$lambda$4$lambda$3(function1, str2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource2, strStringResource3, (Function0) objRememberedValue2, modifierM5144paddingVpY3zN4$default, jM21426getFg20d7_KjU, 0L, textM, iM7919getCentere0LSkKk, composer, 0, 32);
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0), SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), 0.0f, 1, null), null, null, false, false, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, false, null, composer, 0, 0, 8056);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4$lambda$3(Function1 function1, String str) {
                        function1.invoke(str);
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                    invoke(rhModalBottomSheet5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1192530200, i5, -1, "com.robinhood.android.creditcard.ui.creditapplication.incentive.bonus.points.BonusPointsModalBottomSheet.<anonymous> (BonusPointsModalBottomSheet.kt:45)");
                    }
                    BentoTheme2.BentoTheme(Boolean.FALSE, null, Boolean.TRUE, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1300964704, true, new AnonymousClass1(variant, openTermsUrl, strStringResource2, onDismissRequest), composer2, 54), composer2, 100663686, 250);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 1572864 | ((i3 >> 6) & 112), 60);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
