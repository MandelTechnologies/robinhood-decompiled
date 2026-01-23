package com.robinhood.android.gold.downgrade;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.bonfire.ApiGoldValuePropDisclosure;
import com.robinhood.models.api.bonfire.ApiGoldValuePropFeature;
import com.robinhood.models.api.bonfire.ApiGoldValuePropsDowngrade;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GoldDowngradeValuePropsFragmentComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a?\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a{\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0017\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001b\u001aG\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001d\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\u001e"}, m3636d2 = {"GoldDowngradeValuePropsAssetTestTag", "", "getGoldDowngradeValuePropsAssetTestTag$annotations", "()V", "GoldDowngradeValuePropsComposable", "", "goldValuePropsDowngrade", "Lcom/robinhood/models/api/bonfire/ApiGoldValuePropsDowngrade;", "onClickAbort", "Lkotlin/Function0;", "onClickProceed", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/api/bonfire/ApiGoldValuePropsDowngrade;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BaseDowngradeValueProps", "assetPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "title", "descriptionMarkdown", "valueProps", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/models/api/bonfire/ApiGoldValuePropFeature;", "disclosureMarkdown", "primaryCtaText", "secondaryCtaText", "primaryCtaAction", "secondaryCtaAction", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/PersistentList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GoldDowngradeValuePropsActionButtons", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-gold-downgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragmentComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldDowngradeValuePropsFragmentComposable {
    public static final String GoldDowngradeValuePropsAssetTestTag = "gold_downgrade_value_props_asset";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BaseDowngradeValueProps$lambda$10(Painter painter, String str, String str2, ImmutableList3 immutableList3, String str3, String str4, String str5, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BaseDowngradeValueProps(painter, str, str2, immutableList3, str3, str4, str5, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldDowngradeValuePropsActionButtons$lambda$12(String str, String str2, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldDowngradeValuePropsActionButtons(str, str2, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldDowngradeValuePropsComposable$lambda$1(ApiGoldValuePropsDowngrade apiGoldValuePropsDowngrade, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldDowngradeValuePropsComposable(apiGoldValuePropsDowngrade, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getGoldDowngradeValuePropsAssetTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldDowngradeValuePropsComposable(final ApiGoldValuePropsDowngrade apiGoldValuePropsDowngrade, final Function0<Unit> onClickAbort, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        String content;
        List<ApiGoldValuePropFeature> features;
        final Modifier modifier3;
        ApiGoldValuePropDisclosure disclosure;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClickAbort, "onClickAbort");
        Composer composerStartRestartGroup = composer.startRestartGroup(1587514432);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(apiGoldValuePropsDowngrade) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickAbort) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
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
                    ComposerKt.traceEventStart(1587514432, i3, -1, "com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsComposable (GoldDowngradeValuePropsFragmentComposable.kt:48)");
                }
                Painter painterPainterResource = PainterResources_androidKt.painterResource(C17756R.drawable.gold_sad_boy, composerStartRestartGroup, 0);
                content = null;
                String pageTitle = apiGoldValuePropsDowngrade == null ? apiGoldValuePropsDowngrade.getPageTitle() : null;
                String productDescription = apiGoldValuePropsDowngrade == null ? apiGoldValuePropsDowngrade.getProductDescription() : null;
                features = apiGoldValuePropsDowngrade == null ? apiGoldValuePropsDowngrade.getFeatures() : null;
                if (features == null) {
                    features = CollectionsKt.emptyList();
                }
                ImmutableList3 persistentList = extensions2.toPersistentList(features);
                if (apiGoldValuePropsDowngrade != null && (disclosure = apiGoldValuePropsDowngrade.getDisclosure()) != null) {
                    content = disclosure.getContent();
                }
                BaseDowngradeValueProps(painterPainterResource, pageTitle, productDescription, persistentList, content, StringResources_androidKt.stringResource(C17756R.string.gold_downgrade_button_cta_keep, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C17756R.string.gold_downgrade_button_cta_downgrade, composerStartRestartGroup, 0), onClickAbort, function02, modifier4, composerStartRestartGroup, (i3 << 18) & 2143289344, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragmentComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldDowngradeValuePropsFragmentComposable.GoldDowngradeValuePropsComposable$lambda$1(apiGoldValuePropsDowngrade, onClickAbort, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(C17756R.drawable.gold_sad_boy, composerStartRestartGroup, 0);
            content = null;
            if (apiGoldValuePropsDowngrade == null) {
            }
            if (apiGoldValuePropsDowngrade == null) {
            }
            if (apiGoldValuePropsDowngrade == null) {
            }
            if (features == null) {
            }
            ImmutableList3 persistentList2 = extensions2.toPersistentList(features);
            if (apiGoldValuePropsDowngrade != null) {
                content = disclosure.getContent();
            }
            BaseDowngradeValueProps(painterPainterResource2, pageTitle, productDescription, persistentList2, content, StringResources_androidKt.stringResource(C17756R.string.gold_downgrade_button_cta_keep, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C17756R.string.gold_downgrade_button_cta_downgrade, composerStartRestartGroup, 0), onClickAbort, function02, modifier4, composerStartRestartGroup, (i3 << 18) & 2143289344, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BaseDowngradeValueProps(final Painter painter, final String str, final String str2, final ImmutableList3<ApiGoldValuePropFeature> immutableList3, final String str3, final String str4, final String str5, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        Painter painter2;
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Modifier.Companion companion;
        BentoTheme bentoTheme;
        int i5;
        int i6;
        Composer composer2;
        int i7;
        Composer composer3;
        final Modifier modifier3;
        Object obj;
        BentoValuePropRow2 icon;
        BentoValuePropRow2 pog;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2128031043);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            painter2 = painter;
        } else if ((i & 6) == 0) {
            painter2 = painter;
            i3 = (composerStartRestartGroup.changedInstance(painter2) ? 4 : 2) | i;
        } else {
            painter2 = painter;
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
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(immutableList3) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else {
                if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changed(str4) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else {
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(str5) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else {
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                        }
                        if ((i2 & 256) == 0) {
                            if ((i & 100663296) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
                            }
                            i4 = i2 & 512;
                            if (i4 == 0) {
                                i3 |= 805306368;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                if ((i & 805306368) == 0) {
                                    i3 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                                }
                            }
                            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2128031043, i3, -1, "com.robinhood.android.gold.downgrade.BaseDowngradeValueProps (GoldDowngradeValuePropsFragmentComposable.kt:77)");
                                }
                                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Modifier modifier5 = modifier4;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                int i9 = i3;
                                ImageKt.Image(painter2, (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C17756R.dimen.gold_value_props_sad_boy_height, composerStartRestartGroup, 0)), GoldDowngradeValuePropsAssetTestTag), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, (i3 & 14) | 48, 120);
                                composerStartRestartGroup.startReplaceGroup(-13639848);
                                if (str != null) {
                                    companion = companion4;
                                    bentoTheme = bentoTheme2;
                                    i5 = i8;
                                } else {
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                    companion = companion4;
                                    bentoTheme = bentoTheme2;
                                    i5 = i8;
                                    BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i8).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8126);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-13629230);
                                if (str2 != null) {
                                    composer2 = composerStartRestartGroup;
                                    i7 = 0;
                                    i6 = 6;
                                } else {
                                    BentoTheme bentoTheme3 = bentoTheme;
                                    int i10 = i5;
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme3.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                    MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0L, bentoTheme3.getColors(composerStartRestartGroup, i10).m21425getFg0d7_KjU(), false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 21);
                                    i6 = 6;
                                    composer2 = composerStartRestartGroup;
                                    i7 = 0;
                                    BentoMarkdownText2.BentoMarkdownText(str2, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                composer2.startReplaceGroup(-1287847462);
                                for (ApiGoldValuePropFeature apiGoldValuePropFeature : immutableList3) {
                                    if (Intrinsics.areEqual(apiGoldValuePropFeature.getIconKey(), ServerToBentoAssetMapper3.SPARKLE.getServerValue())) {
                                        obj = null;
                                        icon = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, 2, null);
                                    } else {
                                        obj = null;
                                        ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(apiGoldValuePropFeature.getIconKey());
                                        if (serverToBentoAssetMapper3FromServerValue != null) {
                                            pog = new BentoValuePropRow2.Pog(serverToBentoAssetMapper3FromServerValue);
                                            Composer composer4 = composer2;
                                            BentoValuePropRow3.BentoValuePropRow(apiGoldValuePropFeature.getTitle(), apiGoldValuePropFeature.getContent(), pog, BentoValuePropRow.Top, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), composer4, 27648, 0);
                                            composer2 = composer4;
                                        } else {
                                            icon = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, 2, null);
                                        }
                                    }
                                    pog = icon;
                                    Composer composer42 = composer2;
                                    BentoValuePropRow3.BentoValuePropRow(apiGoldValuePropFeature.getTitle(), apiGoldValuePropFeature.getContent(), pog, BentoValuePropRow.Top, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), composer42, 27648, 0);
                                    composer2 = composer42;
                                }
                                Composer composer5 = composer2;
                                composer5.endReplaceGroup();
                                composer5.startReplaceGroup(-1287823598);
                                if (str3 != null) {
                                    composer3 = composer5;
                                } else {
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                                    int i11 = BentoTheme.$stable;
                                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion5, bentoTheme4.getSpacing(composer5, i11).m21590getDefaultD9Ej5fM(), composer5, i6, i7);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, i7);
                                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer5, i7);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer5, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor3);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer5);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion6.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    composer3 = composer5;
                                    i7 = i7;
                                    i6 = i6;
                                    BentoMarkdownText2.BentoMarkdownText(str3, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme4.getTypography(composer5, i11).getTextS(), 0, bentoTheme4.getColors(composer5, i11).m21426getFg20d7_KjU(), bentoTheme4.getColors(composer5, i11).m21426getFg20d7_KjU(), false, composer5, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                                    composer3.endNode();
                                    Unit unit3 = Unit.INSTANCE;
                                }
                                composer3.endReplaceGroup();
                                Composer composer6 = composer3;
                                GoldDowngradeValuePropsActionButtons(str4, str5, function0, function02, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer3, i6, i7), composer6, (i9 >> 15) & 8190, 0);
                                composerStartRestartGroup = composer6;
                                composerStartRestartGroup.endNode();
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
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragmentComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        return GoldDowngradeValuePropsFragmentComposable.BaseDowngradeValueProps$lambda$10(painter, str, str2, immutableList3, str3, str4, str5, function0, function02, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 100663296;
                        i4 = i2 & 512;
                        if (i4 == 0) {
                        }
                        if ((i3 & 306783379) == 306783378) {
                            if (i4 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                            Alignment.Companion companion22 = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally2 = companion22.getCenterHorizontally();
                            Arrangement arrangement2 = Arrangement.INSTANCE;
                            Modifier modifier52 = modifier4;
                            MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                                Column6 column63 = Column6.INSTANCE;
                                Modifier.Companion companion42 = Modifier.INSTANCE;
                                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                int i82 = BentoTheme.$stable;
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ3 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion42, bentoTheme22.getSpacing(composerStartRestartGroup, i82).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0);
                                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getCenterHorizontally(), composerStartRestartGroup, 48);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ3);
                                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                    int i92 = i3;
                                    ImageKt.Image(painter2, (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C17756R.dimen.gold_value_props_sad_boy_height, composerStartRestartGroup, 0)), GoldDowngradeValuePropsAssetTestTag), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, (i3 & 14) | 48, 120);
                                    composerStartRestartGroup.startReplaceGroup(-13639848);
                                    if (str != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(-13629230);
                                    if (str2 != null) {
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    composer2.startReplaceGroup(-1287847462);
                                    while (r0.hasNext()) {
                                    }
                                    Composer composer52 = composer2;
                                    composer52.endReplaceGroup();
                                    composer52.startReplaceGroup(-1287823598);
                                    if (str3 != null) {
                                    }
                                    composer3.endReplaceGroup();
                                    Composer composer62 = composer3;
                                    GoldDowngradeValuePropsActionButtons(str4, str5, function0, function02, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer3, i6, i7), composer62, (i92 >> 15) & 8190, 0);
                                    composerStartRestartGroup = composer62;
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i2 & 256) == 0) {
                    }
                    i4 = i2 & 512;
                    if (i4 == 0) {
                    }
                    if ((i3 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                i4 = i2 & 512;
                if (i4 == 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i4 = i2 & 512;
            if (i4 == 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i4 = i2 & 512;
        if (i4 == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void GoldDowngradeValuePropsActionButtons(final String str, final String str2, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function03;
        int i4;
        final Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-322110328);
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
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function03 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                } else {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-322110328, i3, -1, "com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsActionButtons (GoldDowngradeValuePropsFragmentComposable.kt:163)");
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    Component.ComponentType componentType = Component.ComponentType.BUTTON;
                    int i5 = i3;
                    int i6 = i5 << 3;
                    BentoButtonKt.BentoGoldButton(function03, str, UtilKt.autoLogEvents(modifierFillMaxWidth$default, componentType, str, false, composerStartRestartGroup, ((i3 << 6) & 896) | 54, 4), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, false, (String) null, composerStartRestartGroup, ((i5 >> 6) & 14) | (i6 & 112), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(1751831544);
                    if (str2 != null || function02 == null) {
                        modifier4 = modifier3;
                    } else {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        modifier4 = modifier3;
                        BentoButtonKt.m20586BentoButtonEikTQX8(function02, str2, UtilKt.autoLogEvents(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), componentType, str2, false, composerStartRestartGroup, (i6 & 896) | 54, 4), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i5 >> 9) & 14) | 24576 | (i5 & 112), 0, 8168);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragmentComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GoldDowngradeValuePropsFragmentComposable.GoldDowngradeValuePropsActionButtons$lambda$12(str, str2, function0, function02, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                    Component.ComponentType componentType2 = Component.ComponentType.BUTTON;
                    int i52 = i3;
                    int i62 = i52 << 3;
                    BentoButtonKt.BentoGoldButton(function03, str, UtilKt.autoLogEvents(modifierFillMaxWidth$default2, componentType2, str, false, composerStartRestartGroup, ((i3 << 6) & 896) | 54, 4), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, false, (String) null, composerStartRestartGroup, ((i52 >> 6) & 14) | (i62 & 112), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(1751831544);
                    if (str2 != null) {
                        modifier4 = modifier3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier4;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function03 = function0;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
