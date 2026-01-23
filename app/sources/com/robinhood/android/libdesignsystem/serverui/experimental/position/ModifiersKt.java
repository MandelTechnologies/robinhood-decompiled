package com.robinhood.android.libdesignsystem.serverui.experimental.position;

import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTracker;
import com.robinhood.android.libdesignsystem.serverui.experimental.position.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, m3636d2 = {"trackPosition", "Landroidx/compose/ui/Modifier;", "identifier", "", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ModifiersKt {

    /* compiled from: Modifiers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.position.ModifiersKt$trackPosition$1 */
    static final class C208081 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ String $identifier;

        C208081(String str) {
            this.$identifier = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(-1586148229);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1586148229, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.position.trackPosition.<anonymous> (Modifiers.kt:14)");
            }
            if (this.$identifier != null) {
                final LocalDimensionTracker localDimensionTracker = (LocalDimensionTracker) composer.consume(LocalDimensionTracker2.getLocalDimensionTracker());
                Object objConsume = composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(localDimensionTracker) | composer.changed(this.$identifier);
                final String str = this.$identifier;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.position.ModifiersKt$trackPosition$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ModifiersKt.C208081.invoke$lambda$2$lambda$1(localDimensionTracker, str, (DisposableEffectScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                EffectsKt.DisposableEffect(objConsume, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(localDimensionTracker) | composer.changed(this.$identifier);
                final String str2 = this.$identifier;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.position.ModifiersKt$trackPosition$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ModifiersKt.C208081.invoke$lambda$4$lambda$3(localDimensionTracker, str2, (LayoutCoordinates) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                composed = OnGloballyPositionedModifier3.onGloballyPositioned(composed, (Function1) objRememberedValue2);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return composed;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(LocalDimensionTracker localDimensionTracker, String str, LayoutCoordinates layoutCoordinates) {
            Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
            localDimensionTracker.setPositionData(str, new LocalDimensionTracker.PositionData(LayoutCoordinates2.positionInRoot(layoutCoordinates), layoutCoordinates.mo7241getSizeYbymL2g(), null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult invoke$lambda$2$lambda$1(final LocalDimensionTracker localDimensionTracker, final String str, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new DisposableEffectResult() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.position.ModifiersKt$trackPosition$1$invoke$lambda$2$lambda$1$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    localDimensionTracker.clearPosition(str);
                }
            };
        }
    }

    public static final Modifier trackPosition(Modifier modifier, String str) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, new C208081(str), 1, null);
    }
}
