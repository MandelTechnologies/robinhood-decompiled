package com.robinhood.android.plt;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.plt.PltModifiers;
import com.robinhood.android.plt.contract.PltManager;
import com.robinhood.android.plt.contract.PltManager2;
import com.robinhood.utils.p409ui.context.BaseContexts;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PltModifiers.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u0006\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"recordLoadingState", "Landroidx/compose/ui/Modifier;", "isLoading", "", "identifier", "", "isVisible", "Landroidx/compose/ui/layout/LayoutCoordinates;", "view", "Landroid/view/View;", "globalRootRect", "Landroid/graphics/Rect;", "lib-perceived-loading-time_externalDebug", "hasLoggedAppearButNotDisappear", "currentIsLoading", "lastVisibilityCheckTimestamp", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.plt.PltModifiersKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PltModifiers {
    public static /* synthetic */ Modifier recordLoadingState$default(Modifier modifier, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return recordLoadingState(modifier, z, str);
    }

    /* compiled from: PltModifiers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.plt.PltModifiersKt$recordLoadingState$1 */
    static final class C255431 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ String $identifier;
        final /* synthetic */ boolean $isLoading;

        C255431(boolean z, String str) {
            this.$isLoading = z;
            this.$identifier = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            final PltManager pltManager;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(1435498739);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1435498739, i, -1, "com.robinhood.android.plt.recordLoadingState.<anonymous> (PltModifiers.kt:29)");
            }
            PltManager pltManager2 = (PltManager) composer.consume(PltManager2.getLocalPltManager());
            composer.startReplaceGroup(829787016);
            if (pltManager2 == null) {
                Context context = ((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView())).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
                BaseActivity baseActivity = appCompatActivityFindActivityBaseContext instanceof BaseActivity ? (BaseActivity) appCompatActivityFindActivityBaseContext : null;
                if (baseActivity != null) {
                    pltManager2 = baseActivity.getPltManager();
                    pltManager = pltManager2;
                } else {
                    pltManager = null;
                }
            } else {
                pltManager = pltManager2;
            }
            composer.endReplaceGroup();
            if (pltManager == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return composed;
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composer.endReplaceGroup();
            SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(this.$isLoading), composer, 0);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotLongState3.mutableLongStateOf(0L);
                composer.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotLongState2 snapshotLongState2 = (SnapshotLongState2) objRememberedValue3;
            composer.endReplaceGroup();
            if (invoke$lambda$6(snapshotState4RememberUpdatedState) || invoke$lambda$1(snapshotState)) {
                final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
                final String str = this.$identifier;
                composer.startReplaceGroup(829810218);
                if (str == null) {
                    composer.startReplaceGroup(1849434622);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = UUID.randomUUID().toString();
                        Intrinsics.checkNotNullExpressionValue(objRememberedValue4, "toString(...)");
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    str = (String) objRememberedValue4;
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(view);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.plt.PltModifiersKt$recordLoadingState$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PltModifiers.C255431.invoke$lambda$13$lambda$12(view, snapshotState2, (DisposableEffectScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                EffectsKt.DisposableEffect(view, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composer, 0);
                Unit unit = Unit.INSTANCE;
                composer.startReplaceGroup(-1224400529);
                boolean zChanged = composer.changed(snapshotState4RememberUpdatedState) | composer.changedInstance(pltManager) | composer.changed(str);
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                    Object pltModifiers3 = new PltModifiers3(snapshotState4RememberUpdatedState, snapshotState2, pltManager, str, snapshotState, null);
                    composer.updateRememberedValue(pltModifiers3);
                    objRememberedValue6 = pltModifiers3;
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composer, 6);
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composer.changedInstance(pltManager) | composer.changed(str);
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.plt.PltModifiersKt$recordLoadingState$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PltModifiers.C255431.invoke$lambda$17$lambda$16(pltManager, str, snapshotState, (DisposableEffectScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue7);
                }
                composer.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composer, 6);
                final Rect rect = new Rect();
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance3 = composer.changedInstance(view) | composer.changedInstance(rect);
                Object objRememberedValue8 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: com.robinhood.android.plt.PltModifiersKt$recordLoadingState$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PltModifiers.C255431.invoke$lambda$20$lambda$19(view, rect, snapshotLongState2, snapshotState2, (LayoutCoordinates) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue8);
                }
                composer.endReplaceGroup();
                composed = OnGloballyPositionedModifier3.onGloballyPositioned(composed, (Function1) objRememberedValue8);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return composed;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View$OnAttachStateChangeListener, com.robinhood.android.plt.PltModifiersKt$recordLoadingState$1$1$1$listener$1] */
        public static final DisposableEffectResult invoke$lambda$13$lambda$12(final View view, final SnapshotState snapshotState, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final ?? r3 = new View.OnAttachStateChangeListener() { // from class: com.robinhood.android.plt.PltModifiersKt$recordLoadingState$1$1$1$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    if (PltModifiers.C255431.invoke$lambda$4(snapshotState)) {
                        PltModifiers.C255431.invoke$lambda$5(snapshotState, false);
                    }
                }
            };
            view.addOnAttachStateChangeListener(r3);
            return new DisposableEffectResult() { // from class: com.robinhood.android.plt.PltModifiersKt$recordLoadingState$1$invoke$lambda$13$lambda$12$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    view.removeOnAttachStateChangeListener(r3);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult invoke$lambda$17$lambda$16(final PltManager pltManager, final String str, final SnapshotState snapshotState, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new DisposableEffectResult() { // from class: com.robinhood.android.plt.PltModifiersKt$recordLoadingState$1$invoke$lambda$17$lambda$16$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    if (PltModifiers.C255431.invoke$lambda$1(snapshotState)) {
                        pltManager.onElementLoadEnded(str);
                        PltModifiers.C255431.invoke$lambda$2(snapshotState, false);
                    }
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$4(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$6(SnapshotState4<Boolean> snapshotState4) {
            return snapshotState4.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$20$lambda$19(View view, Rect rect, SnapshotLongState2 snapshotLongState2, SnapshotState snapshotState, LayoutCoordinates coordinates) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - snapshotLongState2.getLongValue() > 250) {
                invoke$lambda$5(snapshotState, PltModifiers.isVisible(coordinates, view, rect));
                snapshotLongState2.setLongValue(jCurrentTimeMillis);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Modifier recordLoadingState(Modifier modifier, boolean z, String str) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, new C255431(z, str), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isVisible(LayoutCoordinates layoutCoordinates, View view, Rect rect) {
        if (!layoutCoordinates.isAttached() || !view.isShown() || !view.getGlobalVisibleRect(rect)) {
            return false;
        }
        androidx.compose.p011ui.geometry.Rect rectBoundsInWindow = LayoutCoordinates2.boundsInWindow(layoutCoordinates);
        return (rectBoundsInWindow.getTop() >= ((float) rect.top) || rectBoundsInWindow.getBottom() <= ((float) rect.bottom)) && (rectBoundsInWindow.getLeft() >= ((float) rect.left) || rectBoundsInWindow.getRight() <= ((float) rect.right));
    }
}
