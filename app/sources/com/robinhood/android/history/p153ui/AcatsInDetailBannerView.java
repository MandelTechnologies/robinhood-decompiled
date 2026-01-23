package com.robinhood.android.history.p153ui;

import android.content.Context;
import android.net.Uri;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.databinding.MergeAcatsDetailBannerViewBinding;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
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

/* compiled from: AcatsInDetailBannerView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0015\u0016\u0017B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/history/ui/AcatsInDetailBannerView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/history/ui/AcatsInDetailBannerView$BannerViewData;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/history/databinding/MergeAcatsDetailBannerViewBinding;", "getBinding", "()Lcom/robinhood/android/history/databinding/MergeAcatsDetailBannerViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "callbacks", "Lcom/robinhood/android/history/ui/AcatsInDetailBannerView$Callbacks;", "Callbacks", "BannerViewData", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AcatsInDetailBannerView extends LinearLayout implements Bindable<BannerViewData> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInDetailBannerView.class, "binding", "getBinding()Lcom/robinhood/android/history/databinding/MergeAcatsDetailBannerViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AcatsInDetailBannerView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/AcatsInDetailBannerView$Callbacks;", "", "onBannerButtonClick", "", "uri", "Landroid/net/Uri;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBannerButtonClick(Uri uri);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsInDetailBannerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.binding = ViewBinding5.viewBinding(this, AcatsInDetailBannerView2.INSTANCE);
        setOrientation(1);
        int dimensionPixelSize = ViewsKt.getDimensionPixelSize(this, C13997R.dimen.rds_spacing_default);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        ViewGroups.inflate(this, C18359R.layout.merge_acats_detail_banner_view, true);
    }

    private final MergeAcatsDetailBannerViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeAcatsDetailBannerViewBinding) value;
    }

    /* compiled from: AcatsInDetailBannerView.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/history/ui/AcatsInDetailBannerView$BannerViewData;", "", "bannerTitle", "", "bannerCompleteDate", "bannerContentMarkdown", "Landroid/text/Spanned;", "bannerButtonText", "bannerButtonLinkUri", "Landroid/net/Uri;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/text/Spanned;Ljava/lang/String;Landroid/net/Uri;)V", "getBannerTitle", "()Ljava/lang/String;", "getBannerCompleteDate", "getBannerContentMarkdown", "()Landroid/text/Spanned;", "getBannerButtonText", "getBannerButtonLinkUri", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BannerViewData {
        public static final int $stable = 8;
        private final Uri bannerButtonLinkUri;
        private final String bannerButtonText;
        private final String bannerCompleteDate;
        private final Spanned bannerContentMarkdown;
        private final String bannerTitle;

        public static /* synthetic */ BannerViewData copy$default(BannerViewData bannerViewData, String str, String str2, Spanned spanned, String str3, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bannerViewData.bannerTitle;
            }
            if ((i & 2) != 0) {
                str2 = bannerViewData.bannerCompleteDate;
            }
            if ((i & 4) != 0) {
                spanned = bannerViewData.bannerContentMarkdown;
            }
            if ((i & 8) != 0) {
                str3 = bannerViewData.bannerButtonText;
            }
            if ((i & 16) != 0) {
                uri = bannerViewData.bannerButtonLinkUri;
            }
            Uri uri2 = uri;
            Spanned spanned2 = spanned;
            return bannerViewData.copy(str, str2, spanned2, str3, uri2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBannerTitle() {
            return this.bannerTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBannerCompleteDate() {
            return this.bannerCompleteDate;
        }

        /* renamed from: component3, reason: from getter */
        public final Spanned getBannerContentMarkdown() {
            return this.bannerContentMarkdown;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBannerButtonText() {
            return this.bannerButtonText;
        }

        /* renamed from: component5, reason: from getter */
        public final Uri getBannerButtonLinkUri() {
            return this.bannerButtonLinkUri;
        }

        public final BannerViewData copy(String bannerTitle, String bannerCompleteDate, Spanned bannerContentMarkdown, String bannerButtonText, Uri bannerButtonLinkUri) {
            return new BannerViewData(bannerTitle, bannerCompleteDate, bannerContentMarkdown, bannerButtonText, bannerButtonLinkUri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerViewData)) {
                return false;
            }
            BannerViewData bannerViewData = (BannerViewData) other;
            return Intrinsics.areEqual(this.bannerTitle, bannerViewData.bannerTitle) && Intrinsics.areEqual(this.bannerCompleteDate, bannerViewData.bannerCompleteDate) && Intrinsics.areEqual(this.bannerContentMarkdown, bannerViewData.bannerContentMarkdown) && Intrinsics.areEqual(this.bannerButtonText, bannerViewData.bannerButtonText) && Intrinsics.areEqual(this.bannerButtonLinkUri, bannerViewData.bannerButtonLinkUri);
        }

        public int hashCode() {
            String str = this.bannerTitle;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bannerCompleteDate;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Spanned spanned = this.bannerContentMarkdown;
            int iHashCode3 = (iHashCode2 + (spanned == null ? 0 : spanned.hashCode())) * 31;
            String str3 = this.bannerButtonText;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Uri uri = this.bannerButtonLinkUri;
            return iHashCode4 + (uri != null ? uri.hashCode() : 0);
        }

        public String toString() {
            String str = this.bannerTitle;
            String str2 = this.bannerCompleteDate;
            Spanned spanned = this.bannerContentMarkdown;
            return "BannerViewData(bannerTitle=" + str + ", bannerCompleteDate=" + str2 + ", bannerContentMarkdown=" + ((Object) spanned) + ", bannerButtonText=" + this.bannerButtonText + ", bannerButtonLinkUri=" + this.bannerButtonLinkUri + ")";
        }

        public BannerViewData(String str, String str2, Spanned spanned, String str3, Uri uri) {
            this.bannerTitle = str;
            this.bannerCompleteDate = str2;
            this.bannerContentMarkdown = spanned;
            this.bannerButtonText = str3;
            this.bannerButtonLinkUri = uri;
        }

        public final String getBannerTitle() {
            return this.bannerTitle;
        }

        public final String getBannerCompleteDate() {
            return this.bannerCompleteDate;
        }

        public final Spanned getBannerContentMarkdown() {
            return this.bannerContentMarkdown;
        }

        public final String getBannerButtonText() {
            return this.bannerButtonText;
        }

        public final Uri getBannerButtonLinkUri() {
            return this.bannerButtonLinkUri;
        }
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(BannerViewData state) {
        Intrinsics.checkNotNullParameter(state, "state");
        bind(state, null);
    }

    public final void bind(final BannerViewData state, final Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(state, "state");
        MergeAcatsDetailBannerViewBinding binding = getBinding();
        RhTextView bannerTitle = binding.bannerTitle;
        Intrinsics.checkNotNullExpressionValue(bannerTitle, "bannerTitle");
        TextViewsKt.setVisibilityText(bannerTitle, state.getBannerTitle());
        RhTextView bannerDate = binding.bannerDate;
        Intrinsics.checkNotNullExpressionValue(bannerDate, "bannerDate");
        TextViewsKt.setVisibilityText(bannerDate, state.getBannerCompleteDate());
        RhTextView bannerContent = binding.bannerContent;
        Intrinsics.checkNotNullExpressionValue(bannerContent, "bannerContent");
        TextViewsKt.setVisibilityText(bannerContent, state.getBannerContentMarkdown());
        RdsTextButton rdsTextButton = binding.bannerButton;
        Intrinsics.checkNotNull(rdsTextButton);
        TextViewsKt.setVisibilityText(rdsTextButton, state.getBannerButtonText());
        OnClickListeners.onClick(rdsTextButton, new Function0() { // from class: com.robinhood.android.history.ui.AcatsInDetailBannerView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInDetailBannerView.bind$lambda$2$lambda$1$lambda$0(callbacks, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2$lambda$1$lambda$0(Callbacks callbacks, BannerViewData bannerViewData) {
        if (callbacks != null) {
            Uri bannerButtonLinkUri = bannerViewData.getBannerButtonLinkUri();
            Intrinsics.checkNotNull(bannerButtonLinkUri);
            callbacks.onBannerButtonClick(bannerButtonLinkUri);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInDetailBannerView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/history/ui/AcatsInDetailBannerView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/history/ui/AcatsInDetailBannerView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<AcatsInDetailBannerView> {
        private final /* synthetic */ Inflater<AcatsInDetailBannerView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public AcatsInDetailBannerView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (AcatsInDetailBannerView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C18359R.layout.include_acats_detail_banner);
        }
    }
}
