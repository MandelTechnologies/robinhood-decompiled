package com.robinhood.android.rhymigration.p245ui.review;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.databinding.MergeExpandableTitleAndBodyViewBinding;
import com.robinhood.staticcontent.model.TitleAndBody;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ExpandableTitleAndBodyView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0017H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/review/ExpandableTitleAndBodyView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/rhymigration/databinding/MergeExpandableTitleAndBodyViewBinding;", "getBinding", "()Lcom/robinhood/android/rhymigration/databinding/MergeExpandableTitleAndBodyViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "expanded", "", "bind", "", "titleAndBody", "Lcom/robinhood/staticcontent/model/TitleAndBody;", "toggleExpanded", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ExpandableTitleAndBodyView extends Hammer_ExpandableTitleAndBodyView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private boolean expanded;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ExpandableTitleAndBodyView.class, "binding", "getBinding()Lcom/robinhood/android/rhymigration/databinding/MergeExpandableTitleAndBodyViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ ExpandableTitleAndBodyView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTitleAndBodyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C27577R.layout.merge_expandable_title_and_body_view, true);
        this.binding = ViewBinding5.viewBinding(this, ExpandableTitleAndBodyView2.INSTANCE);
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

    private final MergeExpandableTitleAndBodyViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeExpandableTitleAndBodyViewBinding) value;
    }

    public final void bind(TitleAndBody titleAndBody) {
        Intrinsics.checkNotNullParameter(titleAndBody, "titleAndBody");
        getBinding().titleTxt.setText(titleAndBody.getTitle());
        Markwon markwon = getMarkwon();
        RhTextView rhTextView = getBinding().bodyTxt;
        String body = titleAndBody.getBody();
        if (body == null) {
            body = "";
        }
        markwon.mo17580setMarkdown(rhTextView, body);
        RhTextView bodyTxt = getBinding().bodyTxt;
        Intrinsics.checkNotNullExpressionValue(bodyTxt, "bodyTxt");
        bodyTxt.setVisibility(8);
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        OnClickListeners.onClick(root, new Function0() { // from class: com.robinhood.android.rhymigration.ui.review.ExpandableTitleAndBodyView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ExpandableTitleAndBodyView.bind$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(ExpandableTitleAndBodyView expandableTitleAndBodyView) {
        expandableTitleAndBodyView.toggleExpanded();
        return Unit.INSTANCE;
    }

    private final void toggleExpanded() {
        this.expanded = !this.expanded;
        RhTextView bodyTxt = getBinding().bodyTxt;
        Intrinsics.checkNotNullExpressionValue(bodyTxt, "bodyTxt");
        bodyTxt.setVisibility(this.expanded ? 0 : 8);
        getBinding().expandBtn.setRotation(this.expanded ? 180.0f : 0.0f);
    }

    /* compiled from: ExpandableTitleAndBodyView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/review/ExpandableTitleAndBodyView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/rhymigration/ui/review/ExpandableTitleAndBodyView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ExpandableTitleAndBodyView> {
        private final /* synthetic */ Inflater<ExpandableTitleAndBodyView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ExpandableTitleAndBodyView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ExpandableTitleAndBodyView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C27577R.layout.include_expandable_title_and_body_view);
        }
    }
}
