package com.truelayer.payments.p419ui.components;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.Flag2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.truelayer.payments.p419ui.models.Country;
import com.truelayer.payments.p419ui.utils.FlagIconUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FlagImage.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ac\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/truelayer/payments/ui/models/Country;", PlaceTypes.COUNTRY, "", "contentDescription", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Lkotlin/ExtensionFunctionType;", "loading", "errorView", "FlagImage", "(Landroidx/compose/ui/Modifier;Lcom/truelayer/payments/ui/models/Country;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.FlagImageKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FlagImage3 {
    public static final void FlagImage(Modifier modifier, final Country country, String str, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        final String str2;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function33;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function34;
        Composer composer2;
        Intrinsics.checkNotNullParameter(country, "country");
        Composer composerStartRestartGroup = composer.startRestartGroup(1269226915);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        final String str3 = (i2 & 4) != 0 ? null : str;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3M27029getLambda1$payments_ui_release = (i2 & 8) != 0 ? FlagImage.INSTANCE.m27029getLambda1$payments_ui_release() : function3;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3ComposableLambda = (i2 & 16) != 0 ? ComposableLambda3.composableLambda(composerStartRestartGroup, 513098555, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.FlagImageKt.FlagImage.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                invoke(boxScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxScope boxScope, Composer composer3, int i3) {
                Intrinsics.checkNotNullParameter(boxScope, "$this$null");
                if ((i3 & 81) != 16 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(513098555, i3, -1, "com.truelayer.payments.ui.components.FlagImage.<anonymous> (FlagImage.kt:23)");
                    }
                    ImageKt.Image(Flag2.getFlag(Icons.Filled.INSTANCE), str3, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 384, 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }) : function32;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1269226915, i, -1, "com.truelayer.payments.ui.components.FlagImage (FlagImage.kt:29)");
        }
        Integer flagResource = FlagIconUtils.INSTANCE.getFlagResource((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), country);
        if (flagResource != null) {
            composerStartRestartGroup.startReplaceableGroup(594275263);
            composer2 = composerStartRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(flagResource.intValue(), composerStartRestartGroup, 0), str3, modifier2, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, ((i >> 3) & 112) | 8 | ((i << 6) & 896), 120);
            str2 = str3;
            composer2.endReplaceableGroup();
            function33 = function3M27029getLambda1$payments_ui_release;
            function34 = function3ComposableLambda;
        } else {
            str2 = str3;
            composerStartRestartGroup.startReplaceableGroup(594275441);
            int i3 = i << 3;
            int i4 = (i & 14) | (57344 & i3) | (i3 & 458752);
            Modifier modifier3 = modifier2;
            function33 = function3M27029getLambda1$payments_ui_release;
            function34 = function3ComposableLambda;
            SvgImage4.SvgImage(modifier3, country.getFlagUri(), null, null, function33, function34, composerStartRestartGroup, i4, 12);
            modifier2 = modifier3;
            composer2 = composerStartRestartGroup;
            composer2.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function35 = function33;
            final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function36 = function34;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.FlagImageKt.FlagImage.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    FlagImage3.FlagImage(modifier4, country, str2, function35, function36, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
