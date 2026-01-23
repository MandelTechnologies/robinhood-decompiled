package com.robinhood.android.psp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p320db.bonfire.ProgramDetailSection;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProgramDetailValuePropsView.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u001e\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailValuePropsView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwonBuilder", "Lio/noties/markwon/Markwon$Builder;", "getMarkwonBuilder", "()Lio/noties/markwon/Markwon$Builder;", "setMarkwonBuilder", "(Lio/noties/markwon/Markwon$Builder;)V", "markwon", "Lio/noties/markwon/Markwon;", "callbacks", "Lcom/robinhood/android/psp/ProgramDetailValuePropsView$Callbacks;", "rowAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/models/db/bonfire/ProgramDetailSection$ValueProps$ValuePropData;", "onAttachedToWindow", "", "bind", "valueProps", "", "Callbacks", "Companion", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ProgramDetailValuePropsView extends Hammer_ProgramDetailValuePropsView {
    private Callbacks callbacks;
    private Markwon markwon;
    public Markwon.Builder markwonBuilder;
    private final GenericListAdapter<RdsRowView, ProgramDetailSection.ValueProps.ValuePropData> rowAdapter;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ProgramDetailValuePropsView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailValuePropsView$Callbacks;", "", "onLearnMoreClicked", "", "url", "", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onLearnMoreClicked(String url);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgramDetailValuePropsView(final Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Markwon markwonBuild = getMarkwonBuilder().build();
        Intrinsics.checkNotNullExpressionValue(markwonBuild, "build(...)");
        this.markwon = markwonBuild;
        GenericListAdapter<RdsRowView, ProgramDetailSection.ValueProps.ValuePropData> genericListAdapterM2987of = GenericListAdapter.INSTANCE.m2987of(RdsRowView.ValuePropRowInflater.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.psp.ProgramDetailValuePropsView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramDetailValuePropsView.rowAdapter$lambda$0((ProgramDetailSection.ValueProps.ValuePropData) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.psp.ProgramDetailValuePropsView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ProgramDetailValuePropsView.rowAdapter$lambda$1(this.f$0, context, (RdsRowView) obj, (ProgramDetailSection.ValueProps.ValuePropData) obj2);
            }
        });
        this.rowAdapter = genericListAdapterM2987of;
        ViewGroups.inflate(this, C25966R.layout.merge_program_details_value_props_view, true);
        setLayoutManager(new LinearLayoutManager(context));
        setAdapter(genericListAdapterM2987of);
    }

    public final Markwon.Builder getMarkwonBuilder() {
        Markwon.Builder builder = this.markwonBuilder;
        if (builder != null) {
            return builder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwonBuilder");
        return null;
    }

    public final void setMarkwonBuilder(Markwon.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<set-?>");
        this.markwonBuilder = builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object rowAdapter$lambda$0(ProgramDetailSection.ValueProps.ValuePropData byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rowAdapter$lambda$1(ProgramDetailValuePropsView programDetailValuePropsView, Context context, RdsRowView of, ProgramDetailSection.ValueProps.ValuePropData item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        RdsRowView.bind$default(of, item.getTitle(), programDetailValuePropsView.markwon.toMarkdown(item.getContentMarkdown()), null, null, null, 28, null);
        of.setLeadingIconDrawable(ContextCompat.getDrawable(context, item.getIcon().getResourceId()));
        of.setClickable(false);
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(Markwons.linkClicks(this.markwon), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.psp.ProgramDetailValuePropsView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramDetailValuePropsView.onAttachedToWindow$lambda$2(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2(ProgramDetailValuePropsView programDetailValuePropsView, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Callbacks callbacks = programDetailValuePropsView.callbacks;
        if (callbacks != null) {
            callbacks.onLearnMoreClicked(url);
        }
        return Unit.INSTANCE;
    }

    public final void bind(List<ProgramDetailSection.ValueProps.ValuePropData> valueProps, Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(valueProps, "valueProps");
        this.rowAdapter.submitList(valueProps);
        this.callbacks = callbacks;
    }

    /* compiled from: ProgramDetailValuePropsView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailValuePropsView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/psp/ProgramDetailValuePropsView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ProgramDetailValuePropsView> {
        private final /* synthetic */ Inflater<ProgramDetailValuePropsView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ProgramDetailValuePropsView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ProgramDetailValuePropsView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C25966R.layout.include_gift_details_value_props_view);
        }
    }
}
