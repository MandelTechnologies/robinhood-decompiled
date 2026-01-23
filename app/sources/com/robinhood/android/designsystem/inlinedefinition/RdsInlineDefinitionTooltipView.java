package com.robinhood.android.designsystem.inlinedefinition;

import android.content.Context;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.inlinedefinition.databinding.MergeRdsInlineDefinitionTooltipViewBinding;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RdsInlineDefinitionTooltipView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002&'B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010!\u001a\u00020\"H\u0014J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTooltipView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTooltipView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTooltipView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTooltipView$Callbacks;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/designsystem/inlinedefinition/databinding/MergeRdsInlineDefinitionTooltipViewBinding;", "getBinding", "()Lcom/robinhood/android/designsystem/inlinedefinition/databinding/MergeRdsInlineDefinitionTooltipViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "value", "", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "onAttachedToWindow", "", "calculateHeight", "", "parentViewWidth", "Callbacks", "Companion", "lib-design-system-inline-definition_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsInlineDefinitionTooltipView extends Hammer_RdsInlineDefinitionTooltipView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RdsInlineDefinitionTooltipView.class, "binding", "getBinding()Lcom/robinhood/android/designsystem/inlinedefinition/databinding/MergeRdsInlineDefinitionTooltipViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RdsInlineDefinitionTooltipView.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTooltipView$Callbacks;", "", "onLinkClicked", "", "onCloseClicked", "lib-design-system-inline-definition_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCloseClicked();

        void onLinkClicked();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsInlineDefinitionTooltipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C14010R.layout.merge_rds_inline_definition_tooltip_view, true);
        this.binding = ViewBinding5.viewBinding(this, RdsInlineDefinitionTooltipView2.INSTANCE);
        ViewCompat.setFocusedByDefault(getBinding().definitionTxt, true);
        ViewCompat.setScreenReaderFocusable(getBinding().definitionTxt, true);
        ViewCompat.replaceAccessibilityAction(getBinding().definitionTxt, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK, context.getText(C11048R.string.general_label_close), new AccessibilityViewCommand() { // from class: com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTooltipView.1
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Callbacks callbacks = RdsInlineDefinitionTooltipView.this.getCallbacks();
                if (callbacks == null) {
                    return true;
                }
                callbacks.onCloseClicked();
                return true;
            }
        });
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    private final MergeRdsInlineDefinitionTooltipViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRdsInlineDefinitionTooltipViewBinding) value;
    }

    public final CharSequence getText() {
        CharSequence text = getBinding().definitionTxt.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    public final void setText(CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getMarkwon().mo17580setMarkdown(getBinding().definitionTxt, value.toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(Markwons.linkClicks(getMarkwon()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTooltipView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RdsInlineDefinitionTooltipView.onAttachedToWindow$lambda$0(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(RdsInlineDefinitionTooltipView rdsInlineDefinitionTooltipView, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Callbacks callbacks = rdsInlineDefinitionTooltipView.callbacks;
        if (callbacks != null) {
            callbacks.onLinkClicked();
        }
        return Unit.INSTANCE;
    }

    public final int calculateHeight(int parentViewWidth) {
        RhTextView rhTextView = getBinding().definitionTxt;
        Intrinsics.checkNotNull(rhTextView);
        int marginStart = ViewsKt.getMarginStart(rhTextView) + ViewsKt.getMarginEnd(rhTextView) + rhTextView.getPaddingStart() + rhTextView.getPaddingEnd();
        int marginTop = ViewsKt.getMarginTop(rhTextView) + ViewsKt.getMarginBottom(rhTextView) + rhTextView.getPaddingTop() + rhTextView.getPaddingBottom();
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(rhTextView.getText(), 0, rhTextView.getText().length(), rhTextView.getPaint(), parentViewWidth - marginStart).setLineSpacing(rhTextView.getLineSpacingExtra(), rhTextView.getLineSpacingMultiplier()).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        return staticLayoutBuild.getHeight() + marginTop;
    }

    /* compiled from: RdsInlineDefinitionTooltipView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTooltipView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTooltipView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system-inline-definition_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RdsInlineDefinitionTooltipView> {
        private final /* synthetic */ Inflater<RdsInlineDefinitionTooltipView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsInlineDefinitionTooltipView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsInlineDefinitionTooltipView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C14010R.layout.include_rds_inline_definition_tooltip_view);
        }
    }
}
