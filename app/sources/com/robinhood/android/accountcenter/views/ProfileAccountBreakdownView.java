package com.robinhood.android.accountcenter.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.databinding.MergeProfileAccountBreakdownViewBinding;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.models.p355ui.ProfileBreakdownInfoBanner;
import com.robinhood.models.p355ui.ProfileBreakdownValueItem;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
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
import okio.ByteString;

/* compiled from: ProfileAccountBreakdownView.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 '2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001'B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0017J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0001\u0010%\u001a\u00020&R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "binding", "Lcom/robinhood/android/accountcenter/databinding/MergeProfileAccountBreakdownViewBinding;", "getBinding", "()Lcom/robinhood/android/accountcenter/databinding/MergeProfileAccountBreakdownViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "bindInfoBanner", "bindValueItems", "handleValueItemClick", "", "valueItem", "Lcom/robinhood/models/ui/ProfileBreakdownValueItem;", "mapSimpleColorWithFallback", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Landroid/content/res/ColorStateList;", "Lcom/robinhood/android/libdesignsystem/serverui/ServerToBentoColorMapper;", "simpleColor", "", "fallback", "", "Companion", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class ProfileAccountBreakdownView extends Hammer_ProfileAccountBreakdownView implements Bindable<ProfileAccountBreakdownState> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Navigator navigator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ProfileAccountBreakdownView.class, "binding", "getBinding()Lcom/robinhood/android/accountcenter/databinding/MergeProfileAccountBreakdownViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAccountBreakdownView(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.binding = ViewBinding5.viewBinding(this, ProfileAccountBreakdownView2.INSTANCE);
        ViewGroups.inflate(this, C8293R.layout.merge_profile_account_breakdown_view, true);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    private final MergeProfileAccountBreakdownViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeProfileAccountBreakdownViewBinding) value;
    }

    private final void bindInfoBanner(ProfileAccountBreakdownState state) {
        LinearLayout profileAccountBreakdownInfoBannerContainer = getBinding().profileAccountBreakdownInfoBannerContainer;
        Intrinsics.checkNotNullExpressionValue(profileAccountBreakdownInfoBannerContainer, "profileAccountBreakdownInfoBannerContainer");
        profileAccountBreakdownInfoBannerContainer.setVisibility(state.getShouldShowInfoBanner() ? 0 : 8);
        getBinding().profileAccountBreakdownInfoBannerContainer.removeAllViews();
        for (final ProfileBreakdownInfoBanner profileBreakdownInfoBanner : state.getData().getInfoBanners()) {
            RdsInfoBannerView.Companion companion = RdsInfoBannerView.INSTANCE;
            LinearLayout profileAccountBreakdownInfoBannerContainer2 = getBinding().profileAccountBreakdownInfoBannerContainer;
            Intrinsics.checkNotNullExpressionValue(profileAccountBreakdownInfoBannerContainer2, "profileAccountBreakdownInfoBannerContainer");
            final RdsInfoBannerView rdsInfoBannerViewInflate = companion.inflate((ViewGroup) profileAccountBreakdownInfoBannerContainer2);
            RichText text = profileBreakdownInfoBanner.getText();
            Context context = rdsInfoBannerViewInflate.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rdsInfoBannerViewInflate.setText(RichTexts.toSpannableString$default(text, context, null, false, null, 14, null));
            ServerToBentoAssetMapper2 icon = profileBreakdownInfoBanner.getIcon();
            rdsInfoBannerViewInflate.setIcon(icon != null ? ViewsKt.getDrawable(rdsInfoBannerViewInflate, icon.getResourceId()) : null);
            com.robinhood.android.autoeventlogging.ViewsKt.setLoggingConfig(rdsInfoBannerViewInflate, new AutoLoggingConfig(false, false, 2, null));
            com.robinhood.android.autoeventlogging.ViewsKt.eventData$default(rdsInfoBannerViewInflate, false, new Function0() { // from class: com.robinhood.android.accountcenter.views.ProfileAccountBreakdownView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProfileAccountBreakdownView.bindInfoBanner$lambda$4$lambda$3$lambda$1(profileBreakdownInfoBanner);
                }
            }, 1, null);
            OnClickListeners.onClick(rdsInfoBannerViewInflate, new Function0() { // from class: com.robinhood.android.accountcenter.views.ProfileAccountBreakdownView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProfileAccountBreakdownView.bindInfoBanner$lambda$4$lambda$3$lambda$2(profileBreakdownInfoBanner, this, rdsInfoBannerViewInflate);
                }
            });
            getBinding().profileAccountBreakdownInfoBannerContainer.addView(rdsInfoBannerViewInflate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindInfoBanner$lambda$4$lambda$3$lambda$1(ProfileBreakdownInfoBanner profileBreakdownInfoBanner) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        ByteString byteString = null;
        return new UserInteractionEventDescriptor(null, new Screen(Screen.Name.PROFILE, null, null, byteString, 14, defaultConstructorMarker), null, null, new Component(Component.ComponentType.INFO_BANNER, profileBreakdownInfoBanner.getLoggingIdentifier(), byteString, 4, defaultConstructorMarker), null, 45, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindInfoBanner$lambda$4$lambda$3$lambda$2(ProfileBreakdownInfoBanner profileBreakdownInfoBanner, ProfileAccountBreakdownView profileAccountBreakdownView, RdsInfoBannerView rdsInfoBannerView) {
        GenericAction action = profileBreakdownInfoBanner.getAction();
        if (action instanceof GenericAction.DeeplinkAction) {
            Navigator navigator = profileAccountBreakdownView.getNavigator();
            Context context = rdsInfoBannerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((GenericAction.DeeplinkAction) action).getUri(), null, null, false, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    private final void bindValueItems(ProfileAccountBreakdownState state) {
        ServerToBentoColorMapper serverToBentoColorMapper = ServerToBentoColorMapper.INSTANCE;
        for (final ProfileBreakdownValueItem profileBreakdownValueItem : state.getData().getValueItems()) {
            ResourceReferences4<ColorStateList> resourceReferences4MapSimpleColorWithFallback = mapSimpleColorWithFallback(serverToBentoColorMapper, profileBreakdownValueItem.getValueColor(), C20690R.attr.colorForeground1);
            RdsRowView.Companion companion = RdsRowView.INSTANCE;
            LinearLayout profileAccountBreakdownRowContainer = getBinding().profileAccountBreakdownRowContainer;
            Intrinsics.checkNotNullExpressionValue(profileAccountBreakdownRowContainer, "profileAccountBreakdownRowContainer");
            RdsRowView rdsRowViewInflate = companion.inflate((ViewGroup) profileAccountBreakdownRowContainer);
            rdsRowViewInflate.setPrimaryText(profileBreakdownValueItem.getTitle());
            rdsRowViewInflate.setMetadataPrimaryText(profileBreakdownValueItem.getValue());
            rdsRowViewInflate.setShowBottomDivider(true);
            ServerToBentoAssetMapper2 valueIcon = profileBreakdownValueItem.getValueIcon();
            rdsRowViewInflate.setTrailingIconDrawable(valueIcon != null ? ViewsKt.getDrawable(rdsRowViewInflate, valueIcon.getResourceId()) : null);
            Context context = rdsRowViewInflate.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rdsRowViewInflate.setTrailingIconTint(ColorStateList.valueOf(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground3)));
            rdsRowViewInflate.setPrimaryMetadataTextColor(resourceReferences4MapSimpleColorWithFallback);
            com.robinhood.android.autoeventlogging.ViewsKt.setLoggingConfig(rdsRowViewInflate, new AutoLoggingConfig(false, false, 2, null));
            com.robinhood.android.autoeventlogging.ViewsKt.eventData$default(rdsRowViewInflate, false, new Function0() { // from class: com.robinhood.android.accountcenter.views.ProfileAccountBreakdownView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProfileAccountBreakdownView.bindValueItems$lambda$9$lambda$8$lambda$6(profileBreakdownValueItem);
                }
            }, 1, null);
            OnClickListeners.onClick(rdsRowViewInflate, new Function0() { // from class: com.robinhood.android.accountcenter.views.ProfileAccountBreakdownView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProfileAccountBreakdownView.bindValueItems$lambda$9$lambda$8$lambda$7(this.f$0, profileBreakdownValueItem);
                }
            });
            getBinding().profileAccountBreakdownRowContainer.addView(rdsRowViewInflate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindValueItems$lambda$9$lambda$8$lambda$6(ProfileBreakdownValueItem profileBreakdownValueItem) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        ByteString byteString = null;
        return new UserInteractionEventDescriptor(null, new Screen(Screen.Name.PROFILE, null, null, byteString, 14, defaultConstructorMarker), UserInteractionEventData.Action.SELECT, null, new Component(Component.ComponentType.ROW, profileBreakdownValueItem.getLoggingIdentifier(), byteString, 4, defaultConstructorMarker), null, 41, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindValueItems$lambda$9$lambda$8$lambda$7(ProfileAccountBreakdownView profileAccountBreakdownView, ProfileBreakdownValueItem profileBreakdownValueItem) {
        profileAccountBreakdownView.handleValueItemClick(profileBreakdownValueItem);
        return Unit.INSTANCE;
    }

    private final boolean handleValueItemClick(ProfileBreakdownValueItem valueItem) {
        GenericAction action = valueItem.getAction();
        if (action instanceof GenericAction.DeeplinkAction) {
            Navigator navigator = getNavigator();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((GenericAction.DeeplinkAction) action).getUri(), null, null, false, null, 60, null);
        }
        if (!(action instanceof GenericAction.InfoAlertAction)) {
            return false;
        }
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlertSheet(((GenericAction.InfoAlertAction) action).getAlert(), true, false, 0, 12, (DefaultConstructorMarker) null), null, 2, null).show(Views.baseActivity(this).getSupportFragmentManager(), "profile-account-breakdown-info-alert");
        return true;
    }

    public final ResourceReferences4<ColorStateList> mapSimpleColorWithFallback(ServerToBentoColorMapper serverToBentoColorMapper, String str, int i) {
        Intrinsics.checkNotNullParameter(serverToBentoColorMapper, "<this>");
        if (str != null && serverToBentoColorMapper.canMapColor(str)) {
            ResourceReferences4<Integer> resourceReferences4MapSimpleServerColor = serverToBentoColorMapper.mapSimpleServerColor(str);
            Intrinsics.checkNotNull(resourceReferences4MapSimpleServerColor);
            return ResourceReferences5.toColorStateList(resourceReferences4MapSimpleServerColor);
        }
        return new ThemedResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, i);
    }

    /* compiled from: ProfileAccountBreakdownView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ProfileAccountBreakdownView> {
        private final /* synthetic */ Inflater<ProfileAccountBreakdownView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ProfileAccountBreakdownView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ProfileAccountBreakdownView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8293R.layout.include_profile_account_breakdown_view);
        }
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    @SuppressLint({"ResourceType"})
    public void bind(ProfileAccountBreakdownState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setVisibility(0);
        getBinding().profileAccountBreakdownRowContainer.removeAllViews();
        bindValueItems(state);
        bindInfoBanner(state);
    }
}
