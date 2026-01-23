package com.robinhood.android.psp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.psp.HoldToActionButtonView;
import com.robinhood.android.psp.databinding.MergeHoldToActionButtonComposeViewBinding;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ViewGroups;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: HoldToActionButtonView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0014\u001a\u00020\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/psp/HoldToActionButtonView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/psp/HoldToActionButtonView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/psp/HoldToActionButtonView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/psp/HoldToActionButtonView$Callbacks;)V", "binding", "Lcom/robinhood/android/psp/databinding/MergeHoldToActionButtonComposeViewBinding;", "getBinding", "()Lcom/robinhood/android/psp/databinding/MergeHoldToActionButtonComposeViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "Callbacks", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class HoldToActionButtonView extends FrameLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(HoldToActionButtonView.class, "binding", "getBinding()Lcom/robinhood/android/psp/databinding/MergeHoldToActionButtonComposeViewBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;

    /* compiled from: HoldToActionButtonView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/psp/HoldToActionButtonView$Callbacks;", "", "onProgress", "", "progress", "", "isDown", "", "onThreshold", "onDown", "onUp", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDown();

        void onProgress(float progress, boolean isDown);

        void onThreshold();

        void onUp();
    }

    public /* synthetic */ HoldToActionButtonView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldToActionButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C25966R.layout.merge_hold_to_action_button_compose_view, true);
        this.binding = ViewBinding5.viewBinding(this, HoldToActionButtonView2.INSTANCE);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    private final MergeHoldToActionButtonComposeViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeHoldToActionButtonComposeViewBinding) value;
    }

    public final void bind() {
        getBinding().composeView.setContent(ComposableLambda3.composableLambdaInstance(-200751098, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.psp.HoldToActionButtonView.bind.1

            /* compiled from: HoldToActionButtonView.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.psp.HoldToActionButtonView$bind$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ HoldToActionButtonView this$0;

                AnonymousClass1(HoldToActionButtonView holdToActionButtonView) {
                    this.this$0 = holdToActionButtonView;
                }

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
                        ComposerKt.traceEventStart(-810852972, i, -1, "com.robinhood.android.psp.HoldToActionButtonView.bind.<anonymous>.<anonymous> (HoldToActionButtonView.kt:39)");
                    }
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(this.this$0);
                    final HoldToActionButtonView holdToActionButtonView = this.this$0;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function2() { // from class: com.robinhood.android.psp.HoldToActionButtonView$bind$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return HoldToActionButtonView.C259481.AnonymousClass1.invoke$lambda$1$lambda$0(holdToActionButtonView, ((Float) obj).floatValue(), ((Boolean) obj2).booleanValue());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function2 function2 = (Function2) objRememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                    final HoldToActionButtonView holdToActionButtonView2 = this.this$0;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.psp.HoldToActionButtonView$bind$1$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HoldToActionButtonView.C259481.AnonymousClass1.invoke$lambda$3$lambda$2(holdToActionButtonView2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                    final HoldToActionButtonView holdToActionButtonView3 = this.this$0;
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.psp.HoldToActionButtonView$bind$1$1$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HoldToActionButtonView.C259481.AnonymousClass1.invoke$lambda$5$lambda$4(holdToActionButtonView3);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function02 = (Function0) objRememberedValue3;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance4 = composer.changedInstance(this.this$0);
                    final HoldToActionButtonView holdToActionButtonView4 = this.this$0;
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.psp.HoldToActionButtonView$bind$1$1$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HoldToActionButtonView.C259481.AnonymousClass1.invoke$lambda$7$lambda$6(holdToActionButtonView4);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    composer.endReplaceGroup();
                    HoldToActionButton.m17778HoldToActionButtonBy00fGY(null, 0, 0L, 0L, 0.0f, function2, function0, function02, (Function0) objRememberedValue4, composer, 0, 31);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(HoldToActionButtonView holdToActionButtonView, float f, boolean z) {
                    Callbacks callbacks = holdToActionButtonView.getCallbacks();
                    if (callbacks != null) {
                        callbacks.onProgress(f, z);
                    }
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$7$lambda$6(HoldToActionButtonView holdToActionButtonView) {
                    Callbacks callbacks = holdToActionButtonView.getCallbacks();
                    if (callbacks != null) {
                        callbacks.onThreshold();
                    }
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$3$lambda$2(HoldToActionButtonView holdToActionButtonView) {
                    Callbacks callbacks = holdToActionButtonView.getCallbacks();
                    if (callbacks != null) {
                        callbacks.onDown();
                    }
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$5$lambda$4(HoldToActionButtonView holdToActionButtonView) {
                    Callbacks callbacks = holdToActionButtonView.getCallbacks();
                    if (callbacks != null) {
                        callbacks.onUp();
                    }
                    return Unit.INSTANCE;
                }
            }

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
                    ComposerKt.traceEventStart(-200751098, i, -1, "com.robinhood.android.psp.HoldToActionButtonView.bind.<anonymous> (HoldToActionButtonView.kt:38)");
                }
                BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(HoldToActionButtonView.this)), null, ComposableLambda3.rememberComposableLambda(-810852972, true, new AnonymousClass1(HoldToActionButtonView.this), composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }
}
