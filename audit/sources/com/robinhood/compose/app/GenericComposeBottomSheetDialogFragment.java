package com.robinhood.compose.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.compose.app.C11918R;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.scarlet.LocalScarletManager;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericComposeBottomSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\r\u0010\r\u001a\u00020\u0005H'¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose-app_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public abstract class GenericComposeBottomSheetDialogFragment extends BaseBottomSheetDialogFragment {
    public static final int $stable = BaseBottomSheetDialogFragment.$stable;

    public abstract void ComposeContent(Composer composer, int i);

    public GenericComposeBottomSheetDialogFragment() {
        super(C11918R.layout.fragment_bottom_sheet_generic_compose);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ScarletManager scarletManager;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!(view instanceof ComposeView)) {
            throw new IllegalStateException("Check failed.");
        }
        ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
        if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            scarletManager = ScarletManager2.getScarletManager(contextRequireContext);
        }
        final Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(scarletManager);
        ((ComposeView) view).setContent(ComposableLambda3.composableLambdaInstance(2132190023, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment.onViewCreated.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ScarletManager scarletManager2;
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2132190023, i, -1, "com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment.onViewCreated.<anonymous> (GenericComposeBottomSheetDialogFragment.kt:37)");
                }
                ProvidedValue<Navigator> providedValueProvides = LocalNavigator.getLocalNavigator().provides(GenericComposeBottomSheetDialogFragment.this.getNavigator());
                CompositionLocal6<ScarletManager> localScarletManager = LocalScarletManager.getLocalScarletManager();
                ScarletContextWrapper scarletContextWrapper2 = GenericComposeBottomSheetDialogFragment.this.getScarletContextWrapper();
                if (scarletContextWrapper2 == null || (scarletManager2 = ScarletManager2.getScarletManager(scarletContextWrapper2)) == null) {
                    Context contextRequireContext2 = GenericComposeBottomSheetDialogFragment.this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                    scarletManager2 = ScarletManager2.getScarletManager(contextRequireContext2);
                }
                ProvidedValue[] providedValueArr = {providedValueProvides, localScarletManager.provides(scarletManager2)};
                final Observable<ThemesFromScarlet> observable = observableThemeChangesForCompose;
                final GenericComposeBottomSheetDialogFragment genericComposeBottomSheetDialogFragment = GenericComposeBottomSheetDialogFragment.this;
                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(102483591, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment.onViewCreated.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(102483591, i2, -1, "com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment.onViewCreated.<anonymous>.<anonymous> (GenericComposeBottomSheetDialogFragment.kt:42)");
                        }
                        Observable<ThemesFromScarlet> observable2 = observable;
                        final GenericComposeBottomSheetDialogFragment genericComposeBottomSheetDialogFragment2 = genericComposeBottomSheetDialogFragment;
                        BentoTheme2.BentoTheme(observable2, null, ComposableLambda3.rememberComposableLambda(1247827989, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment.onViewCreated.1.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1247827989, i3, -1, "com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (GenericComposeBottomSheetDialogFragment.kt:43)");
                                }
                                genericComposeBottomSheetDialogFragment2.ComposeContent(composer3, BaseBottomSheetDialogFragment.$stable);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }
}
