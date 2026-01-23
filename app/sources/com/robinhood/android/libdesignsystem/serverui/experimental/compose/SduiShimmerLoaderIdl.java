package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.ShimmerLoaderDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: SduiShimmerLoaderIdl.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"SduiShimmerLoader", "", "ActionT", "component", "Lrh_server_driven_ui/v1/ShimmerLoaderDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lrh_server_driven_ui/v1/ShimmerLoaderDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiShimmerLoaderIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiShimmerLoaderIdl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiShimmerLoader$lambda$0(ShimmerLoaderDto shimmerLoaderDto, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiShimmerLoader(shimmerLoaderDto, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiShimmerLoader$lambda$1(ShimmerLoaderDto shimmerLoaderDto, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiShimmerLoader(shimmerLoaderDto, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT> void SduiShimmerLoader(final ShimmerLoaderDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1334808807);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1334808807, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiShimmerLoader (SduiShimmerLoaderIdl.kt:13)");
            }
            final UIComponentDto content = component.getContent();
            if (content == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiShimmerLoaderIdlKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiShimmerLoaderIdl.SduiShimmerLoader$lambda$0(component, parseAction, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Modifier modifier5 = modifier3;
            LocalShowPlaceholder.Loadable(true, modifier5, null, ComposableLambda3.rememberComposableLambda(-10175881, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiShimmerLoaderIdlKt.SduiShimmerLoader.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-10175881, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiShimmerLoader.<anonymous> (SduiShimmerLoaderIdl.kt:19)");
                    }
                    SduiComponentIdl.SduiComponent(content, parseAction, (Modifier) null, (HorizontalPadding) null, composer2, 0, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 112) | 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiShimmerLoaderIdlKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiShimmerLoaderIdl.SduiShimmerLoader$lambda$1(component, parseAction, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
