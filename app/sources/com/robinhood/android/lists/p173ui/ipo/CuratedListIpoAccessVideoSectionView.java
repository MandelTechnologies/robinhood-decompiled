package com.robinhood.android.lists.p173ui.ipo;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.Player;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.databinding.MergeCuratedListIpoAccessVideoSectionViewBinding;
import com.robinhood.android.lists.p173ui.ipo.video.VideoContainerView;
import com.robinhood.android.lists.p173ui.ipo.video.VideoContainerViewState;
import com.robinhood.directipo.models.api.ApiVideoSection;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: CuratedListIpoAccessVideoSectionView.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessVideoSectionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/lists/databinding/MergeCuratedListIpoAccessVideoSectionViewBinding;", "getBinding", "()Lcom/robinhood/android/lists/databinding/MergeCuratedListIpoAccessVideoSectionViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Lcom/robinhood/directipo/models/api/ApiVideoSection;", "player", "Landroidx/media3/common/Player;", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListIpoAccessVideoSectionView extends ConstraintLayout {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CuratedListIpoAccessVideoSectionView.class, "binding", "getBinding()Lcom/robinhood/android/lists/databinding/MergeCuratedListIpoAccessVideoSectionViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListIpoAccessVideoSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, CuratedListIpoAccessVideoSectionView2.INSTANCE);
        ViewGroups.inflate(this, C20839R.layout.merge_curated_list_ipo_access_video_section_view, true);
    }

    private final MergeCuratedListIpoAccessVideoSectionViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeCuratedListIpoAccessVideoSectionViewBinding) value;
    }

    /* compiled from: CuratedListIpoAccessVideoSectionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessVideoSectionView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessVideoSectionView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CuratedListIpoAccessVideoSectionView> {
        private final /* synthetic */ Inflater<CuratedListIpoAccessVideoSectionView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CuratedListIpoAccessVideoSectionView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CuratedListIpoAccessVideoSectionView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_curated_list_ipo_access_video_section_view);
        }
    }

    public final void bind(ApiVideoSection state, Player player) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(player, "player");
        VideoContainerView videoContainerView = getBinding().videoContainerView;
        Uri androidUri = HttpUrl2.toAndroidUri(state.getSection_data().getUrl());
        HttpUrl preview_image_url = state.getSection_data().getPreview_image_url();
        videoContainerView.bind(new VideoContainerViewState.VideoViewState(androidUri, preview_image_url != null ? HttpUrl2.toAndroidUri(preview_image_url) : null, state.getSection_data().getAspect_ratio(), player));
    }
}
