package com.robinhood.android.lists.p173ui.ipo;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.databinding.MergeCuratedListIpoAccessHeaderBinding;
import com.robinhood.android.lists.p173ui.rhlist.HeaderState;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CuratedListIpoAccessHeaderView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001cB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/lists/ui/rhlist/HeaderState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/lists/databinding/MergeCuratedListIpoAccessHeaderBinding;", "getBinding", "()Lcom/robinhood/android/lists/databinding/MergeCuratedListIpoAccessHeaderBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "bindTitle", "bindSubtitle", "bindDescription", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListIpoAccessHeaderView extends Hammer_CuratedListIpoAccessHeaderView implements Bindable<HeaderState> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CuratedListIpoAccessHeaderView.class, "binding", "getBinding()Lcom/robinhood/android/lists/databinding/MergeCuratedListIpoAccessHeaderBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListIpoAccessHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C20839R.layout.merge_curated_list_ipo_access_header, true);
        this.binding = ViewBinding5.viewBinding(this, CuratedListIpoAccessHeaderView2.INSTANCE);
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

    private final MergeCuratedListIpoAccessHeaderBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeCuratedListIpoAccessHeaderBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(HeaderState state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(state, "state");
        bindTitle(state);
        bindSubtitle(state);
        bindDescription(state);
    }

    private final void bindTitle(HeaderState state) {
        getBinding().curatedListIpoHeaderTitle.setText(state.getDisplayName());
    }

    private final void bindSubtitle(HeaderState state) throws Resources.NotFoundException {
        String str = InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(state.getUpdatedAt());
        String string2 = getResources().getString(C11048R.string.general_label_robinhood);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        getBinding().curatedListIpoHeaderSubtitle.setText(getResources().getString(C20839R.string.lists_subtitle_owner_and_date_format, string2, str));
    }

    private final void bindDescription(HeaderState state) {
        RdsInlineDefinitionTextView rdsInlineDefinitionTextView = getBinding().curatedListIpoHeaderDescription;
        Intrinsics.checkNotNull(rdsInlineDefinitionTextView);
        rdsInlineDefinitionTextView.setVisibility(state.getShowDescription() ? 0 : 8);
        MarkdownContent description = state.getDescription();
        if (description != null) {
            rdsInlineDefinitionTextView.setSpannableString(new SpannableString(Markwons.toSpanned$default(getMarkwon(), description, null, 2, null)));
        }
    }

    /* compiled from: CuratedListIpoAccessHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessHeaderView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessHeaderView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CuratedListIpoAccessHeaderView> {
        private final /* synthetic */ Inflater<CuratedListIpoAccessHeaderView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CuratedListIpoAccessHeaderView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CuratedListIpoAccessHeaderView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_curated_list_ipo_access_header);
        }
    }
}
