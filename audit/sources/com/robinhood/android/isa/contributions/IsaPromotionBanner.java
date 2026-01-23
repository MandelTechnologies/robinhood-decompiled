package com.robinhood.android.isa.contributions;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import coil.compose.SingletonAsyncImage;
import coil.request.ImageRequest;
import coil.size.Size;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaTabBannerConfig;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.targetbackend.Endpoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: IsaPromotionBanner.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"IsaPromotionBanner", "", "upsellConfig", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaTabBannerConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/isa/models/isa/db/entity/IsaTabBannerConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-isa-contributions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.isa.contributions.IsaPromotionBannerKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaPromotionBanner {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IsaPromotionBanner$lambda$6(IsaTabBannerConfig isaTabBannerConfig, Modifier modifier, int i, int i2, Composer composer, int i3) {
        IsaPromotionBanner(isaTabBannerConfig, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IsaPromotionBanner(final IsaTabBannerConfig upsellConfig, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Context context;
        final Navigator navigator;
        boolean zChangedInstance;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(upsellConfig, "upsellConfig");
        Composer composerStartRestartGroup = composer.startRestartGroup(-184510755);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(upsellConfig) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-184510755, i3, -1, "com.robinhood.android.isa.contributions.IsaPromotionBanner (IsaPromotionBanner.kt:37)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                HttpUrl httpUrlBuild = Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegments(!bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay() ? upsellConfig.getAssetPathLightMobile() : upsellConfig.getAssetPathDarkMobile()).build();
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(Intrinsic3.height(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Intrinsic4.Min), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM())), bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), null, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(upsellConfig);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaPromotionBannerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IsaPromotionBanner.IsaPromotionBanner$lambda$1$lambda$0(navigator, context, upsellConfig);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue, 7, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Modifier modifier4 = modifier3;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxHeight$default(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getSpaceBetween(), companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR0);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(upsellConfig.getTitle(), PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                String ctaText = upsellConfig.getCtaText();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(upsellConfig);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaPromotionBannerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IsaPromotionBanner.IsaPromotionBanner$lambda$5$lambda$4$lambda$3$lambda$2(navigator, context, upsellConfig);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue2, ctaText, null, null, null, false, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                composerStartRestartGroup.endNode();
                SingletonAsyncImage.m9119AsyncImagegl8XCv8(new ImageRequest.Builder(context).data(httpUrlBuild).size(Size.ORIGINAL).build(), null, AspectRatio3.aspectRatio$default(SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl((int) upsellConfig.getAssetRenderWidthMobile())), upsellConfig.getAssetWidthMobile() / upsellConfig.getAssetHeightMobile(), false, 2, null), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, false, null, composerStartRestartGroup, 1572912, 0, 4024);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaPromotionBannerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaPromotionBanner.IsaPromotionBanner$lambda$6(upsellConfig, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            HttpUrl httpUrlBuild2 = Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegments(!bentoTheme2.getColors(composerStartRestartGroup, i52).getIsDay() ? upsellConfig.getAssetPathLightMobile() : upsellConfig.getAssetPathDarkMobile()).build();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(Clip.clip(Intrinsic3.height(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Intrinsic4.Min), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM())), bentoTheme2.getColors(composerStartRestartGroup, i52).m21372getBg20d7_KjU(), null, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(upsellConfig);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaPromotionBannerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IsaPromotionBanner.IsaPromotionBanner$lambda$1$lambda$0(navigator, context, upsellConfig);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default2, false, null, null, (Function0) objRememberedValue, 7, null);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Modifier modifier42 = modifier3;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierM5145paddingqDBjuR02 = PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxHeight$default(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM());
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getSpaceBetween(), companion4.getStart(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR02);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(upsellConfig.getTitle(), PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                        String ctaText2 = upsellConfig.getCtaText();
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(upsellConfig);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaPromotionBannerKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IsaPromotionBanner.IsaPromotionBanner$lambda$5$lambda$4$lambda$3$lambda$2(navigator, context, upsellConfig);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue2, ctaText2, null, null, null, false, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                            composerStartRestartGroup.endNode();
                            SingletonAsyncImage.m9119AsyncImagegl8XCv8(new ImageRequest.Builder(context).data(httpUrlBuild2).size(Size.ORIGINAL).build(), null, AspectRatio3.aspectRatio$default(SizeKt.m5174width3ABfNKs(companion32, C2002Dp.m7995constructorimpl((int) upsellConfig.getAssetRenderWidthMobile())), upsellConfig.getAssetWidthMobile() / upsellConfig.getAssetHeightMobile(), false, 2, null), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, false, null, composerStartRestartGroup, 1572912, 0, 4024);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier42;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IsaPromotionBanner$lambda$1$lambda$0(Navigator navigator, Context context, IsaTabBannerConfig isaTabBannerConfig) {
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(isaTabBannerConfig.getCtaDeeplink()), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IsaPromotionBanner$lambda$5$lambda$4$lambda$3$lambda$2(Navigator navigator, Context context, IsaTabBannerConfig isaTabBannerConfig) {
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(isaTabBannerConfig.getCtaDeeplink()), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }
}
