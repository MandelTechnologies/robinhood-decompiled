package com.robinhood.android.common.shareholder.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.p088ui.BindResourcesKt;
import com.robinhood.android.common.shareholder.C11820R;
import com.robinhood.android.common.shareholder.view.ShareholderProfileIconView;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shareholderx.models.p401db.CompanyIcon;
import com.robinhood.utils.extensions.ViewsKt;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* compiled from: ShareholderProfileIconView.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 52\u00020\u0001:\u000245B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*J\b\u0010,\u001a\u00020%H\u0014J\u0010\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020\"H\u0002J\u0010\u0010/\u001a\u0002002\u0006\u0010+\u001a\u00020*H\u0002J\u0018\u00101\u001a\u0002002\u0006\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020\u000fH\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001d\u0010\u0011R\u000e\u0010\u001f\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/common/shareholder/view/ShareholderProfileIconView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "iconPadding", "", "getIconPadding", "()I", "iconPadding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "iconSize", "getIconSize", "iconSize$delegate", "iconBackground", "Landroid/graphics/drawable/Drawable;", "getIconBackground", "()Landroid/graphics/drawable/Drawable;", "iconBackground$delegate", "defaultStackOffset", "getDefaultStackOffset", "defaultStackOffset$delegate", "iconOffset", "profileIconsRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/common/shareholder/view/ShareholderProfileIconView$ShareholderProfileIcons;", "kotlin.jvm.PlatformType", "bind", "", "logo", "Lcom/robinhood/shareholderx/models/db/CompanyIcon;", "portraits", "", "", "symbol", "onAttachedToWindow", "renderStackedIcons", "profileIcons", "createSymbolIconView", "Lcom/robinhood/android/designsystem/pog/RdsPogView;", "getNewIconView", "iconUrl", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "ShareholderProfileIcons", "Companion", "feature-lib-shareholderx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ShareholderProfileIconView extends Hammer_ShareholderProfileIconView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ShareholderProfileIconView.class, "iconPadding", "getIconPadding()I", 0)), Reflection.property1(new PropertyReference1Impl(ShareholderProfileIconView.class, "iconSize", "getIconSize()I", 0)), Reflection.property1(new PropertyReference1Impl(ShareholderProfileIconView.class, "iconBackground", "getIconBackground()Landroid/graphics/drawable/Drawable;", 0)), Reflection.property1(new PropertyReference1Impl(ShareholderProfileIconView.class, "defaultStackOffset", "getDefaultStackOffset()I", 0))};
    private static final int MAX_ICON_COUNT = 3;

    /* renamed from: defaultStackOffset$delegate, reason: from kotlin metadata */
    private final Interfaces2 defaultStackOffset;

    /* renamed from: iconBackground$delegate, reason: from kotlin metadata */
    private final Interfaces2 iconBackground;
    private int iconOffset;

    /* renamed from: iconPadding$delegate, reason: from kotlin metadata */
    private final Interfaces2 iconPadding;

    /* renamed from: iconSize$delegate, reason: from kotlin metadata */
    private final Interfaces2 iconSize;
    public ImageLoader imageLoader;
    private final BehaviorRelay<ShareholderProfileIcons> profileIconsRelay;

    public /* synthetic */ ShareholderProfileIconView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareholderProfileIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.iconPadding = BindResourcesKt.bindDimenPixelSize(this, C11820R.dimen.shareholder_profile_icon_stroke_width);
        this.iconSize = BindResourcesKt.bindDimenPixelSize(this, C13997R.dimen.pog_size);
        this.iconBackground = BindResourcesKt.bindDrawable(this, C11820R.drawable.qa_icon_stroke);
        this.defaultStackOffset = BindResourcesKt.bindDimenPixelSize(this, C11820R.dimen.shareholder_profile_icon_default_stack_offset);
        BehaviorRelay<ShareholderProfileIcons> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.profileIconsRelay = behaviorRelayCreate;
        int[] ShareholderProfileIconView = C11820R.styleable.ShareholderProfileIconView;
        Intrinsics.checkNotNullExpressionValue(ShareholderProfileIconView, "ShareholderProfileIconView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ShareholderProfileIconView, 0, 0);
        this.iconOffset = getIconSize() - typedArrayObtainStyledAttributes.getDimensionPixelOffset(C11820R.styleable.ShareholderProfileIconView_iconOverlap, getDefaultStackOffset());
        typedArrayObtainStyledAttributes.recycle();
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    private final int getIconPadding() {
        return ((Number) this.iconPadding.getValue(this, $$delegatedProperties[0])).intValue();
    }

    private final int getIconSize() {
        return ((Number) this.iconSize.getValue(this, $$delegatedProperties[1])).intValue();
    }

    private final Drawable getIconBackground() {
        return (Drawable) this.iconBackground.getValue(this, $$delegatedProperties[2]);
    }

    private final int getDefaultStackOffset() {
        return ((Number) this.defaultStackOffset.getValue(this, $$delegatedProperties[3])).intValue();
    }

    public static /* synthetic */ void bind$default(ShareholderProfileIconView shareholderProfileIconView, CompanyIcon companyIcon, List list, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        shareholderProfileIconView.bind(companyIcon, list, str);
    }

    public final void bind(CompanyIcon logo, List<String> portraits, String symbol) {
        Intrinsics.checkNotNullParameter(portraits, "portraits");
        this.profileIconsRelay.accept(new ShareholderProfileIcons(logo, portraits, null, symbol, 4, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Observable observableCombineLatest = Observable.combineLatest(Contexts7.requireBaseActivityBaseContext(context).getDayNightStyleChanges(), this.profileIconsRelay, new BiFunction() { // from class: com.robinhood.android.common.shareholder.view.ShareholderProfileIconView.onAttachedToWindow.1
            @Override // io.reactivex.functions.BiFunction
            public final ShareholderProfileIcons apply(DayNightOverlay overlay, ShareholderProfileIcons profileIcons) {
                Intrinsics.checkNotNullParameter(overlay, "overlay");
                Intrinsics.checkNotNullParameter(profileIcons, "profileIcons");
                return new ShareholderProfileIcons(profileIcons.getLogo(), profileIcons.getPortraits(), overlay, profileIcons.getSymbol());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        ViewDisposerKt.bindTo$default(observableCombineLatest, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.shareholder.view.ShareholderProfileIconView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareholderProfileIconView.onAttachedToWindow$lambda$1(this.f$0, (ShareholderProfileIconView.ShareholderProfileIcons) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(ShareholderProfileIconView shareholderProfileIconView, ShareholderProfileIcons shareholderProfileIcons) {
        Intrinsics.checkNotNull(shareholderProfileIcons);
        shareholderProfileIconView.renderStackedIcons(shareholderProfileIcons);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void renderStackedIcons(ShareholderProfileIcons profileIcons) {
        List<String> portraits;
        int i;
        int iCoerceAtMost;
        int i2;
        removeAllViews();
        if (profileIcons.getLogo() != null) {
            portraits = CollectionsKt.plus((Collection) CollectionsKt.listOf(UtilsKt.getThemedUrl(profileIcons.getLogo(), profileIcons.getOverlay())), (Iterable) profileIcons.getPortraits());
        } else {
            if (profileIcons.getSymbol() != null) {
                addView(createSymbolIconView(profileIcons.getSymbol()), 0);
                portraits = profileIcons.getPortraits();
                i = 1;
                iCoerceAtMost = RangesKt.coerceAtMost(portraits.size(), 3 - getChildCount());
                for (i2 = 0; i2 < iCoerceAtMost; i2++) {
                    String str = portraits.get(i2);
                    if (str.length() > 0) {
                        addView(getNewIconView(str, i), 0);
                        i++;
                    }
                }
                setVisibility(getChildCount() > 0 ? 0 : 8);
            }
            portraits = profileIcons.getPortraits();
        }
        i = 0;
        iCoerceAtMost = RangesKt.coerceAtMost(portraits.size(), 3 - getChildCount());
        while (i2 < iCoerceAtMost) {
        }
        setVisibility(getChildCount() > 0 ? 0 : 8);
    }

    private final RdsPogView createSymbolIconView(String symbol) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RdsPogView rdsPogView = new RdsPogView(new ScarletContextWrapper(context, null, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.pogStyle), 2, null), null);
        rdsPogView.setText(symbol);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.height = getIconSize() + getIconPadding();
        layoutParams.width = getIconSize() + getIconPadding();
        rdsPogView.setLayoutParams(layoutParams);
        int iconPadding = getIconPadding();
        rdsPogView.setPadding(iconPadding, iconPadding, iconPadding, iconPadding);
        rdsPogView.setBackground(getIconBackground());
        return rdsPogView;
    }

    private final RdsPogView getNewIconView(String iconUrl, int index) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final RdsPogView rdsPogView = new RdsPogView(new ScarletContextWrapper(context, null, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.pogStyle), 2, null), null);
        rdsPogView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        ViewsKt.setMarginStart(rdsPogView, this.iconOffset * index);
        int iconPadding = getIconPadding();
        rdsPogView.setPadding(iconPadding, iconPadding, iconPadding, iconPadding);
        rdsPogView.setBackground(getIconBackground());
        getImageLoader().load(iconUrl).size(getIconSize(), getIconSize()).centerCrop().circle().into(new ImageLoader.Target() { // from class: com.robinhood.android.common.shareholder.view.ShareholderProfileIconView.getNewIconView.1
            @Override // com.robinhood.android.rhimage.ImageLoader.Target
            public void onStart(Drawable placeholder) {
            }

            @Override // com.robinhood.android.rhimage.ImageLoader.Target
            public void onSuccess(Drawable result) {
                if (result != null) {
                    rdsPogView.setPictogram(result);
                }
            }

            @Override // com.robinhood.android.rhimage.ImageLoader.Target
            public void onError(Drawable error) {
                this.removeView(rdsPogView);
                ShareholderProfileIconView shareholderProfileIconView = this;
                shareholderProfileIconView.setVisibility(shareholderProfileIconView.getChildCount() > 0 ? 0 : 8);
            }
        });
        return rdsPogView;
    }

    /* compiled from: ShareholderProfileIconView.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/shareholder/view/ShareholderProfileIconView$ShareholderProfileIcons;", "", "logo", "Lcom/robinhood/shareholderx/models/db/CompanyIcon;", "portraits", "", "", "overlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "symbol", "<init>", "(Lcom/robinhood/shareholderx/models/db/CompanyIcon;Ljava/util/List;Lcom/robinhood/android/designsystem/style/DayNightOverlay;Ljava/lang/String;)V", "getLogo", "()Lcom/robinhood/shareholderx/models/db/CompanyIcon;", "getPortraits", "()Ljava/util/List;", "getOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getSymbol", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-shareholderx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShareholderProfileIcons {
        private final CompanyIcon logo;
        private final DayNightOverlay overlay;
        private final List<String> portraits;
        private final String symbol;

        public ShareholderProfileIcons() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShareholderProfileIcons copy$default(ShareholderProfileIcons shareholderProfileIcons, CompanyIcon companyIcon, List list, DayNightOverlay dayNightOverlay, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                companyIcon = shareholderProfileIcons.logo;
            }
            if ((i & 2) != 0) {
                list = shareholderProfileIcons.portraits;
            }
            if ((i & 4) != 0) {
                dayNightOverlay = shareholderProfileIcons.overlay;
            }
            if ((i & 8) != 0) {
                str = shareholderProfileIcons.symbol;
            }
            return shareholderProfileIcons.copy(companyIcon, list, dayNightOverlay, str);
        }

        /* renamed from: component1, reason: from getter */
        public final CompanyIcon getLogo() {
            return this.logo;
        }

        public final List<String> component2() {
            return this.portraits;
        }

        /* renamed from: component3, reason: from getter */
        public final DayNightOverlay getOverlay() {
            return this.overlay;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public final ShareholderProfileIcons copy(CompanyIcon logo, List<String> portraits, DayNightOverlay overlay, String symbol) {
            Intrinsics.checkNotNullParameter(portraits, "portraits");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            return new ShareholderProfileIcons(logo, portraits, overlay, symbol);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShareholderProfileIcons)) {
                return false;
            }
            ShareholderProfileIcons shareholderProfileIcons = (ShareholderProfileIcons) other;
            return Intrinsics.areEqual(this.logo, shareholderProfileIcons.logo) && Intrinsics.areEqual(this.portraits, shareholderProfileIcons.portraits) && this.overlay == shareholderProfileIcons.overlay && Intrinsics.areEqual(this.symbol, shareholderProfileIcons.symbol);
        }

        public int hashCode() {
            CompanyIcon companyIcon = this.logo;
            int iHashCode = (((((companyIcon == null ? 0 : companyIcon.hashCode()) * 31) + this.portraits.hashCode()) * 31) + this.overlay.hashCode()) * 31;
            String str = this.symbol;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ShareholderProfileIcons(logo=" + this.logo + ", portraits=" + this.portraits + ", overlay=" + this.overlay + ", symbol=" + this.symbol + ")";
        }

        public ShareholderProfileIcons(CompanyIcon companyIcon, List<String> portraits, DayNightOverlay overlay, String str) {
            Intrinsics.checkNotNullParameter(portraits, "portraits");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            this.logo = companyIcon;
            this.portraits = portraits;
            this.overlay = overlay;
            this.symbol = str;
        }

        public final CompanyIcon getLogo() {
            return this.logo;
        }

        public /* synthetic */ ShareholderProfileIcons(CompanyIcon companyIcon, List list, DayNightOverlay dayNightOverlay, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : companyIcon, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? DayNightOverlay.DAY : dayNightOverlay, (i & 8) != 0 ? null : str);
        }

        public final List<String> getPortraits() {
            return this.portraits;
        }

        public final DayNightOverlay getOverlay() {
            return this.overlay;
        }

        public final String getSymbol() {
            return this.symbol;
        }
    }
}
