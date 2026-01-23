package com.robinhood.compose.app;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.compose.C11917R;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.plt.contract.PltManager2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.scarlet.LocalScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ViewGroups;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GenericComposeView.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\tH'¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\tH\u0014¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/compose/app/GenericComposeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "onAttachedToWindow", "lib-compose-app_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public abstract class GenericComposeView extends FrameLayout {
    public static final int $stable = 8;

    public abstract void Content(Composer composer, int i);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericComposeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C11917R.layout.merge_generic_compose_view, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((ComposeView) findViewById(C11917R.id.compose_view)).setContent(ComposableLambda3.composableLambdaInstance(-1667922034, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.GenericComposeView.onAttachedToWindow.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1667922034, i, -1, "com.robinhood.compose.app.GenericComposeView.onAttachedToWindow.<anonymous> (GenericComposeView.kt:43)");
                }
                ProvidedValue[] providedValueArr = {LocalScarletManager.getLocalScarletManager().provides(ScarletManager2.getScarletManager(GenericComposeView.this)), PltManager2.getLocalPltManager().provides(Views.getPltManager(GenericComposeView.this))};
                final GenericComposeView genericComposeView = GenericComposeView.this;
                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(69610190, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.GenericComposeView.onAttachedToWindow.1.1
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
                            ComposerKt.traceEventStart(69610190, i2, -1, "com.robinhood.compose.app.GenericComposeView.onAttachedToWindow.<anonymous>.<anonymous> (GenericComposeView.kt:47)");
                        }
                        Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(genericComposeView));
                        final GenericComposeView genericComposeView2 = genericComposeView;
                        BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(1624592476, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.GenericComposeView.onAttachedToWindow.1.1.1
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
                                    ComposerKt.traceEventStart(1624592476, i3, -1, "com.robinhood.compose.app.GenericComposeView.onAttachedToWindow.<anonymous>.<anonymous>.<anonymous> (GenericComposeView.kt:48)");
                                }
                                genericComposeView2.Content(composer3, 0);
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
