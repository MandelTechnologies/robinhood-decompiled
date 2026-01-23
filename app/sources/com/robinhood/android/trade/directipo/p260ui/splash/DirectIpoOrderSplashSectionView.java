package com.robinhood.android.trade.directipo.p260ui.splash;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.trade.directipo.C29323R;
import com.robinhood.android.trade.directipo.databinding.MergeDirectIpoOrderSplashSectionBinding;
import com.robinhood.directipo.models.p292db.DirectIpoOrderEntryIntro;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DirectIpoOrderSplashSectionView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashSectionView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/directipo/models/db/DirectIpoOrderEntryIntro$Section;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/trade/directipo/databinding/MergeDirectIpoOrderSplashSectionBinding;", "getBinding", "()Lcom/robinhood/android/trade/directipo/databinding/MergeDirectIpoOrderSplashSectionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "sectionAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashSectionRowView;", "Lcom/robinhood/directipo/models/db/DirectIpoOrderEntryIntro$SectionRow;", "bind", "", "state", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DirectIpoOrderSplashSectionView extends LinearLayout implements Bindable<DirectIpoOrderEntryIntro.Section> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final GenericListAdapter<DirectIpoOrderSplashSectionRowView, DirectIpoOrderEntryIntro.SectionRow> sectionAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoOrderSplashSectionView.class, "binding", "getBinding()Lcom/robinhood/android/trade/directipo/databinding/MergeDirectIpoOrderSplashSectionBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectIpoOrderSplashSectionView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.binding = ViewBinding5.viewBinding(this, DirectIpoOrderSplashSectionView2.INSTANCE);
        GenericListAdapter<DirectIpoOrderSplashSectionRowView, DirectIpoOrderEntryIntro.SectionRow> genericListAdapterM2986of = GenericListAdapter.INSTANCE.m2986of(DirectIpoOrderSplashSectionRowView.INSTANCE, DiffCallbacks.Equality.INSTANCE);
        this.sectionAdapter = genericListAdapterM2986of;
        setOrientation(1);
        ViewGroups.inflate(this, C29323R.layout.merge_direct_ipo_order_splash_section, true);
        getBinding().sectionList.setHasFixedSize(true);
        getBinding().sectionList.setAdapter(genericListAdapterM2986of);
    }

    private final MergeDirectIpoOrderSplashSectionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeDirectIpoOrderSplashSectionBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(DirectIpoOrderEntryIntro.Section state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getBinding().sectionTitle.setText(state.getTitle());
        this.sectionAdapter.submitList(state.getRows());
    }

    /* compiled from: DirectIpoOrderSplashSectionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashSectionView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashSectionView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<DirectIpoOrderSplashSectionView> {
        private final /* synthetic */ Inflater<DirectIpoOrderSplashSectionView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public DirectIpoOrderSplashSectionView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (DirectIpoOrderSplashSectionView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C29323R.layout.include_direct_ipo_order_splash_section);
        }
    }
}
