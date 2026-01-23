package com.robinhood.android.acatsin.intro;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.databinding.MergeAcatsIntroStepViewBinding;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AcatsIntroStepView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0016R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/acatsin/intro/AcatsIntroStepView;", "Landroidx/core/widget/NestedScrollView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/acatsin/intro/AcatsIntroPage;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "", "viewBinding", "Lcom/robinhood/android/acatsin/databinding/MergeAcatsIntroStepViewBinding;", "getViewBinding", "()Lcom/robinhood/android/acatsin/databinding/MergeAcatsIntroStepViewBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsIntroStepView extends NestedScrollView implements Bindable<AcatsIntroPage> {
    private final GenericListAdapter<RhTextView, Integer> adapter;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsIntroStepView.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/acatsin/databinding/MergeAcatsIntroStepViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsIntroStepView(final Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.adapter = GenericListAdapter.INSTANCE.m2985of(C7725R.layout.include_acats_intro_list_row, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.acatsin.intro.AcatsIntroStepView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcatsIntroStepView.adapter$lambda$0(context, (RhTextView) obj, ((Integer) obj2).intValue());
            }
        });
        this.viewBinding = ViewBinding5.viewBinding(this, AcatsIntroStepView2.INSTANCE);
        ViewGroups.inflate(this, C7725R.layout.merge_acats_intro_step_view, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$0(Context context, RhTextView of, int i) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        of.setText(context.getString(i));
        return Unit.INSTANCE;
    }

    private final MergeAcatsIntroStepViewBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeAcatsIntroStepViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(AcatsIntroPage state) {
        Intrinsics.checkNotNullParameter(state, "state");
        MergeAcatsIntroStepViewBinding viewBinding = getViewBinding();
        RhTextView titleTxt = viewBinding.titleTxt;
        Intrinsics.checkNotNullExpressionValue(titleTxt, "titleTxt");
        TextViewsKt.setTextAppearanceAttr(titleTxt, state.getTitleTextAppearanceRes());
        viewBinding.titleTxt.setText(getContext().getString(state.getTitleRes()));
        RhTextView rhTextView = viewBinding.descriptionTxt;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(getContext().getText(state.getDescriptionRes()));
        rhTextView.setText(new SpannedString(spannableStringBuilder));
        RecyclerView list = viewBinding.list;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        list.setVisibility(state.getIsListVisible() ? 0 : 8);
        viewBinding.list.setAdapter(this.adapter);
        this.adapter.submitList(state.getListItems());
    }

    /* compiled from: AcatsIntroStepView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/intro/AcatsIntroStepView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/acatsin/intro/AcatsIntroStepView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<AcatsIntroStepView> {
        private final /* synthetic */ Inflater<AcatsIntroStepView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public AcatsIntroStepView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (AcatsIntroStepView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C7725R.layout.include_acats_intro_step_view);
        }
    }
}
