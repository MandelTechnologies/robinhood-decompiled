package com.robinhood.android.acatsin.util;

import android.graphics.Bitmap;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BrokerageLogoComposables.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\b\u001a/\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "RobinhoodBrokerageLogo", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroid/graphics/Bitmap;", "bitmap", "ContraBrokerageLogo", "(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "", "iconDrawable", "iconTint", "BrokerageIconLogo--RWsq2U", "(Landroidx/compose/ui/Modifier;JIJLandroidx/compose/runtime/Composer;II)V", "BrokerageIconLogo", "BrokerageBitmapLogo", "Lkotlin/Function0;", "content", "BrokerageLogoShape-3IgeMak", "(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BrokerageLogoShape", "RobinhoodBrokerageLogoPreview", "(Landroidx/compose/runtime/Composer;I)V", "DefaultContraBrokerageLogoPreview", "feature-acats-in_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.util.BrokerageLogoComposablesKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class BrokerageLogoComposables {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrokerageBitmapLogo$lambda$3(Modifier modifier, Bitmap bitmap, int i, int i2, Composer composer, int i3) {
        BrokerageBitmapLogo(modifier, bitmap, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrokerageIconLogo__RWsq2U$lambda$2(Modifier modifier, long j, int i, long j2, int i2, int i3, Composer composer, int i4) {
        m10778BrokerageIconLogoRWsq2U(modifier, j, i, j2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BrokerageLogoShape_3IgeMak$lambda$5(Modifier modifier, long j, Function2 function2, int i, int i2, Composer composer, int i3) {
        m10779BrokerageLogoShape3IgeMak(modifier, j, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContraBrokerageLogo$lambda$1(Modifier modifier, Bitmap bitmap, int i, int i2, Composer composer, int i3) {
        ContraBrokerageLogo(modifier, bitmap, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultContraBrokerageLogoPreview$lambda$7(int i, Composer composer, int i2) {
        DefaultContraBrokerageLogoPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RobinhoodBrokerageLogo$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        RobinhoodBrokerageLogo(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RobinhoodBrokerageLogoPreview$lambda$6(int i, Composer composer, int i2) {
        RobinhoodBrokerageLogoPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RobinhoodBrokerageLogo(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1060685962);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1060685962, i3, -1, "com.robinhood.android.acatsin.util.RobinhoodBrokerageLogo (BrokerageLogoComposables.kt:30)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            m10778BrokerageIconLogoRWsq2U(modifier2, bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU(), C20690R.drawable.ic_rds_robinhood_24dp, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), composerStartRestartGroup, i3 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.util.BrokerageLogoComposablesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BrokerageLogoComposables.RobinhoodBrokerageLogo$lambda$0(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ContraBrokerageLogo(final Modifier modifier, final Bitmap bitmap, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(900180830);
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
            i3 |= composerStartRestartGroup.changedInstance(bitmap) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(900180830, i3, -1, "com.robinhood.android.acatsin.util.ContraBrokerageLogo (BrokerageLogoComposables.kt:47)");
            }
            if (bitmap != null) {
                composerStartRestartGroup.startReplaceGroup(-488556671);
                BrokerageBitmapLogo(LocalShowPlaceholder.withBentoPlaceholder$default(modifier, false, null, 3, null), bitmap, composerStartRestartGroup, i3 & 112, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-488416613);
                Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(modifier, false, null, 3, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                m10778BrokerageIconLogoRWsq2U(modifierWithBentoPlaceholder$default, bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), C20690R.drawable.ic_rds_banking_24dp, bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.util.BrokerageLogoComposablesKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BrokerageLogoComposables.ContraBrokerageLogo$lambda$1(modifier, bitmap, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: BrokerageIconLogo--RWsq2U, reason: not valid java name */
    private static final void m10778BrokerageIconLogoRWsq2U(Modifier modifier, final long j, final int i, final long j2, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2009901736);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            j3 = j;
        } else {
            j3 = j;
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(j3) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i4 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2009901736, i4, -1, "com.robinhood.android.acatsin.util.BrokerageIconLogo (BrokerageLogoComposables.kt:69)");
            }
            m10779BrokerageLogoShape3IgeMak(LocalShowPlaceholder.withBentoPlaceholder$default(modifier, false, null, 3, null), j3, ComposableLambda3.rememberComposableLambda(-950156921, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.util.BrokerageLogoComposablesKt$BrokerageIconLogo$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-950156921, i6, -1, "com.robinhood.android.acatsin.util.BrokerageIconLogo.<anonymous> (BrokerageLogoComposables.kt:74)");
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, composer2, 0), (String) null, SizeKt.fillMaxHeight(Modifier.INSTANCE, 0.5f), (Alignment) null, ContentScale.INSTANCE.getInside(), 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, j2, 0, 2, null), composer2, 25008, 40);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & 112) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.util.BrokerageLogoComposablesKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BrokerageLogoComposables.BrokerageIconLogo__RWsq2U$lambda$2(modifier2, j, i, j2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void BrokerageBitmapLogo(final Modifier modifier, final Bitmap bitmap, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(728167598);
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
            i3 |= composerStartRestartGroup.changedInstance(bitmap) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(728167598, i3, -1, "com.robinhood.android.acatsin.util.BrokerageBitmapLogo (BrokerageLogoComposables.kt:89)");
            }
            int i5 = (i3 & 14) | 432;
            Modifier modifier2 = modifier;
            m10779BrokerageLogoShape3IgeMak(modifier2, Color.INSTANCE.m6725getTransparent0d7_KjU(), ComposableLambda3.rememberComposableLambda(-278246737, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.util.BrokerageLogoComposablesKt.BrokerageBitmapLogo.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-278246737, i6, -1, "com.robinhood.android.acatsin.util.BrokerageBitmapLogo.<anonymous> (BrokerageLogoComposables.kt:94)");
                    }
                    ImageKt.m4912Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), null, null, null, ContentScale.INSTANCE.getInside(), 0.0f, null, 0, composer2, 24624, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i5, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.util.BrokerageLogoComposablesKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BrokerageLogoComposables.BrokerageBitmapLogo$lambda$3(modifier, bitmap, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: BrokerageLogoShape-3IgeMak, reason: not valid java name */
    private static final void m10779BrokerageLogoShape3IgeMak(Modifier modifier, final long j, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1974562491);
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
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1974562491, i3, -1, "com.robinhood.android.acatsin.util.BrokerageLogoShape (BrokerageLogoComposables.kt:107)");
            }
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5171sizeVpY3zN4(modifier, PrimitiveResources_androidKt.dimensionResource(C7725R.dimen.brokerage_logo_width, composerStartRestartGroup, 0), PrimitiveResources_androidKt.dimensionResource(C7725R.dimen.brokerage_logo_height, composerStartRestartGroup, 0)), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(C7725R.dimen.brokerage_logo_corner_radius, composerStartRestartGroup, 0))), j, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = modifier;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.util.BrokerageLogoComposablesKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BrokerageLogoComposables.BrokerageLogoShape_3IgeMak$lambda$5(modifier2, j, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RobinhoodBrokerageLogoPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-598447517);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-598447517, i, -1, "com.robinhood.android.acatsin.util.RobinhoodBrokerageLogoPreview (BrokerageLogoComposables.kt:124)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BrokerageLogoComposables3.INSTANCE.getLambda$269417499$feature_acats_in_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.util.BrokerageLogoComposablesKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BrokerageLogoComposables.RobinhoodBrokerageLogoPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void DefaultContraBrokerageLogoPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1177399521);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1177399521, i, -1, "com.robinhood.android.acatsin.util.DefaultContraBrokerageLogoPreview (BrokerageLogoComposables.kt:133)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BrokerageLogoComposables3.INSTANCE.m10780getLambda$2046999337$feature_acats_in_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.util.BrokerageLogoComposablesKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BrokerageLogoComposables.DefaultContraBrokerageLogoPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
