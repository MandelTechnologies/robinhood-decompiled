package com.robinhood.android.common.p088ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.Bundle2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.util.Themes3;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.PrimaryFragmentHost;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import me.saket.bettermovementmethod.BetterLinkMovementMethod;
import timber.log.Timber;

/* compiled from: RhDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u0089\u00012\u00020\u0001:\b\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010k\u001a\u00020'H\u0016J\u0010\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020oH\u0016J\u0012\u0010p\u001a\u00020m2\b\u0010q\u001a\u0004\u0018\u00010=H\u0016J\b\u0010r\u001a\u00020mH\u0014J&\u0010s\u001a\u0004\u0018\u00010t2\u0006\u0010u\u001a\u00020v2\b\u0010w\u001a\u0004\u0018\u00010x2\b\u0010q\u001a\u0004\u0018\u00010=H\u0016J\u001c\u0010y\u001a\u0004\u0018\u00010t2\u0006\u0010u\u001a\u00020v2\b\u0010w\u001a\u0004\u0018\u00010xH\u0002J\u001a\u0010z\u001a\u00020m2\u0006\u0010{\u001a\u00020t2\b\u0010q\u001a\u0004\u0018\u00010=H\u0016J\b\u0010|\u001a\u00020mH\u0014J\b\u0010}\u001a\u00020mH\u0014J\u0011\u0010~\u001a\u0002082\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0014J\u0013\u0010\u0081\u0001\u001a\u00020m2\b\u0010\u0082\u0001\u001a\u00030\u0080\u0001H\u0002J\u0013\u0010\u0083\u0001\u001a\u00020m2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00168DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001b\u0010\u0018R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00168DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001e\u0010\u0018R\u001d\u0010 \u001a\u0004\u0018\u00010\u00168DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b!\u0010\u0018R\u001d\u0010#\u001a\u0004\u0018\u00010\u00168DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u000f\u001a\u0004\b$\u0010\u0018R\u001b\u0010&\u001a\u00020'8WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u001b\u0010,\u001a\u00020'8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b-\u0010)R\u001b\u0010/\u001a\u00020'8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b0\u0010)R\u001d\u00102\u001a\u0004\u0018\u0001038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b4\u00105R\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b9\u0010:R\u001d\u0010<\u001a\u0004\u0018\u00010=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010+\u001a\u0004\b>\u0010?R#\u0010A\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010+\u001a\u0004\bD\u0010ER\u001d\u0010G\u001a\u0004\u0018\u0001038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010+\u001a\u0004\bH\u00105R\u001d\u0010J\u001a\u0004\u0018\u0001038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bL\u0010+\u001a\u0004\bK\u00105R\u001b\u0010M\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010+\u001a\u0004\bN\u0010:R\u001d\u0010P\u001a\u0004\u0018\u0001038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010+\u001a\u0004\bQ\u00105R\u001d\u0010S\u001a\u0004\u0018\u0001038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010+\u001a\u0004\bT\u00105R\u001d\u0010V\u001a\u0004\u0018\u0001038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010+\u001a\u0004\bW\u00105R\u001d\u0010Y\u001a\u0004\u0018\u0001088DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010+\u001a\u0004\bZ\u0010[R\u0012\u0010]\u001a\u00020'8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001e\u0010^\u001a\u00020'8\u0014@\u0014X\u0095\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010)\"\u0004\b`\u0010aR\u001b\u0010b\u001a\u00020'8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bd\u0010+\u001a\u0004\bc\u0010)R\u001b\u0010e\u001a\u00020'8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bg\u0010+\u001a\u0004\bf\u0010)R\u001b\u0010h\u001a\u0002088TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bj\u0010+\u001a\u0004\bi\u0010:¨\u0006\u008a\u0001"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhDialogFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "imageView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "pogView", "Lcom/robinhood/android/designsystem/pog/RdsPogView;", "getPogView", "()Lcom/robinhood/android/designsystem/pog/RdsPogView;", "pogView$delegate", "titleTxt", "Landroid/widget/TextView;", "getTitleTxt", "()Landroid/widget/TextView;", "titleTxt$delegate", "messageTxt", "getMessageTxt", "messageTxt$delegate", "additionalTxt", "getAdditionalTxt", "additionalTxt$delegate", "negativeBtn", "getNegativeBtn", "negativeBtn$delegate", "positiveBtn", "getPositiveBtn", "positiveBtn$delegate", "dialogId", "", "getDialogId", "()I", "dialogId$delegate", "Lkotlin/Lazy;", "imageResId", "getImageResId", "imageResId$delegate", "pogPictogramId", "getPogPictogramId", "pogPictogramId$delegate", "pogText", "", "getPogText", "()Ljava/lang/CharSequence;", "pogText$delegate", "useDesignSystemOverlay", "", "getUseDesignSystemOverlay", "()Z", "useDesignSystemOverlay$delegate", "passthroughArgs", "Landroid/os/Bundle;", "getPassthroughArgs", "()Landroid/os/Bundle;", "passthroughArgs$delegate", "imageTint", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Landroid/content/res/ColorStateList;", "getImageTint", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "imageTint$delegate", "title", "getTitle", "title$delegate", "message", "getMessage", "message$delegate", "dismissOnLinkTextClick", "getDismissOnLinkTextClick", "dismissOnLinkTextClick$delegate", "additionalMessage", "getAdditionalMessage", "additionalMessage$delegate", "positiveText", "getPositiveText", "positiveText$delegate", "negativeText", "getNegativeText", "negativeText$delegate", "cancelable", "getCancelable", "()Ljava/lang/Boolean;", "cancelable$delegate", "themeResId", "layoutResId", "getLayoutResId", "setLayoutResId", "(I)V", "dialogWidth", "getDialogWidth", "dialogWidth$delegate", "dialogHeight", "getDialogHeight", "dialogHeight$delegate", "useParentFragmentScarletContextWrapper", "getUseParentFragmentScarletContextWrapper", "useParentFragmentScarletContextWrapper$delegate", "getTheme", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "logDialogAnalytics", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "createView", "onViewCreated", "view", "onPositiveButtonClick", "onNegativeButtonClick", "onLinkTextClick", "url", "", "setDialogFragmentResult", "type", "onDismiss", "activity", "Landroid/app/Activity;", "OnClickListener", "OnDismissListener", "Builder", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class RhDialogFragment extends BaseDialogFragment {
    private static final String EXTRA_ADDITIONAL_MESSAGE = "rhAdditionalMsg";
    private static final String EXTRA_CANCELABLE = "rhCancelable";
    private static final String EXTRA_DISMISS_ON_LINK_TEXT_CLICK = "rhDismissOnLinkTextClick";
    private static final String EXTRA_ID = "rhId";
    private static final String EXTRA_IMAGE_ID = "rhImageId";
    private static final String EXTRA_IMAGE_TINT = "rhImageTint";
    private static final String EXTRA_LAYOUT_HEIGHT = "rhLayoutHeight";
    private static final String EXTRA_LAYOUT_RES = "rhLayoutRes";
    private static final String EXTRA_LAYOUT_WIDTH = "rhLayoutWidth";
    protected static final String EXTRA_MESSAGE = "rhMsg";
    private static final String EXTRA_NEGATIVE_BUTTON_TEXT = "rhNegative";
    private static final String EXTRA_PASSTHROUGH_ARGS = "rhPassthroughArgs";
    private static final String EXTRA_POG_PICTOGRAM_ID = "rhPogPictogramId";
    private static final String EXTRA_POG_TEXT = "rhPogText";
    private static final String EXTRA_POSITIVE_BUTTON_TEXT = "rhPositive";
    private static final String EXTRA_THEME = "rhTheme";
    private static final String EXTRA_TITLE = "rhTitle";
    private static final String EXTRA_USE_DESIGN_SYSTEM_OVERLAY = "rhUseDesignSystemTheme";
    private static final String EXTRA_USE_PARENT_FRAGMENT_SCARLET_CONTEXT = "rhUseParentFragmentScarletContext";
    public static final String REQUEST_KEY = "rhDialogRequestKey";
    public static final String RESULT_KEY_DIALOG_ID = "rhDialogId";
    public static final String RESULT_KEY_PASSTHROUGH_ARGS = "rhPassthroughArgs";
    public static final String RESULT_KEY_TYPE = "rhButton";
    public static final String RESULT_LINK_TEXT = "rhLinkText";
    public static final String RESULT_NEGATIVE = "rhNegative";
    public static final String RESULT_POSITIVE = "rhPositive";

    /* renamed from: additionalMessage$delegate, reason: from kotlin metadata */
    private final Lazy additionalMessage;
    public AnalyticsLogger analytics;

    /* renamed from: cancelable$delegate, reason: from kotlin metadata */
    private final Lazy cancelable;

    /* renamed from: dialogHeight$delegate, reason: from kotlin metadata */
    private final Lazy dialogHeight;

    /* renamed from: dialogWidth$delegate, reason: from kotlin metadata */
    private final Lazy dialogWidth;

    /* renamed from: dismissOnLinkTextClick$delegate, reason: from kotlin metadata */
    private final Lazy dismissOnLinkTextClick;

    /* renamed from: imageTint$delegate, reason: from kotlin metadata */
    private final Lazy imageTint;
    private int layoutResId;

    /* renamed from: message$delegate, reason: from kotlin metadata */
    private final Lazy message;

    /* renamed from: negativeText$delegate, reason: from kotlin metadata */
    private final Lazy negativeText;

    /* renamed from: passthroughArgs$delegate, reason: from kotlin metadata */
    private final Lazy passthroughArgs;

    /* renamed from: positiveText$delegate, reason: from kotlin metadata */
    private final Lazy positiveText;
    private int themeResId;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    private final Lazy title;

    /* renamed from: useDesignSystemOverlay$delegate, reason: from kotlin metadata */
    private final Lazy useDesignSystemOverlay;

    /* renamed from: useParentFragmentScarletContextWrapper$delegate, reason: from kotlin metadata */
    private final Lazy useParentFragmentScarletContextWrapper;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhDialogFragment.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0)), Reflection.property1(new PropertyReference1Impl(RhDialogFragment.class, "pogView", "getPogView()Lcom/robinhood/android/designsystem/pog/RdsPogView;", 0)), Reflection.property1(new PropertyReference1Impl(RhDialogFragment.class, "titleTxt", "getTitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(RhDialogFragment.class, "messageTxt", "getMessageTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(RhDialogFragment.class, "additionalTxt", "getAdditionalTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(RhDialogFragment.class, "negativeBtn", "getNegativeBtn()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(RhDialogFragment.class, "positiveBtn", "getPositiveBtn()Landroid/widget/TextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: imageView$delegate, reason: from kotlin metadata */
    private final Interfaces2 imageView = bindView(C11048R.id.dialog_fragment_img);

    /* renamed from: pogView$delegate, reason: from kotlin metadata */
    private final Interfaces2 pogView = bindView(C13997R.id.dialog_fragment_pog);

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTxt = bindView(C11048R.id.dialog_fragment_title);

    /* renamed from: messageTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 messageTxt = bindView(C11048R.id.dialog_fragment_message);

    /* renamed from: additionalTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 additionalTxt = bindView(C11048R.id.dialog_fragment_additional_message);

    /* renamed from: negativeBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 negativeBtn = bindView(C11048R.id.dialog_fragment_negative_btn);

    /* renamed from: positiveBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 positiveBtn = bindView(C11048R.id.dialog_fragment_positive_btn);

    /* renamed from: dialogId$delegate, reason: from kotlin metadata */
    private final Lazy dialogId = Fragments2.argument(this, EXTRA_ID, 0);

    /* renamed from: imageResId$delegate, reason: from kotlin metadata */
    private final Lazy imageResId = Fragments2.argument(this, EXTRA_IMAGE_ID, 0);

    /* renamed from: pogPictogramId$delegate, reason: from kotlin metadata */
    private final Lazy pogPictogramId = Fragments2.argument(this, EXTRA_POG_PICTOGRAM_ID, 0);

    /* renamed from: pogText$delegate, reason: from kotlin metadata */
    private final Lazy pogText = Fragments2.argument(this, EXTRA_POG_TEXT);

    /* compiled from: RhDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J$\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "Landroid/os/Bundle;", "onNegativeButtonClicked", "onLinkTextClicked", "url", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public interface OnClickListener {
        boolean onLinkTextClicked(int id, Bundle passthroughArgs, String url);

        boolean onNegativeButtonClicked(int id, Bundle passthroughArgs);

        boolean onPositiveButtonClicked(int id, Bundle passthroughArgs);
    }

    /* compiled from: RhDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "", "onDialogDismissed", "", "id", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public interface OnDismissListener {
        void onDialogDismissed(int id);
    }

    @JvmStatic
    public static final Builder create(Context context) {
        return INSTANCE.create(context);
    }

    public RhDialogFragment() {
        Boolean bool = Boolean.FALSE;
        this.useDesignSystemOverlay = Fragments2.argument(this, EXTRA_USE_DESIGN_SYSTEM_OVERLAY, bool);
        this.passthroughArgs = Fragments2.argument(this, "rhPassthroughArgs");
        this.imageTint = Fragments2.argument(this, EXTRA_IMAGE_TINT);
        this.title = Fragments2.argument(this, EXTRA_TITLE);
        this.message = Fragments2.argument(this, EXTRA_MESSAGE);
        this.dismissOnLinkTextClick = Fragments2.argument(this, EXTRA_DISMISS_ON_LINK_TEXT_CLICK, bool);
        this.additionalMessage = Fragments2.argument(this, EXTRA_ADDITIONAL_MESSAGE);
        this.positiveText = Fragments2.argument(this, "rhPositive");
        this.negativeText = Fragments2.argument(this, "rhNegative");
        this.cancelable = Fragments2.argument(this, EXTRA_CANCELABLE);
        this.dialogWidth = Fragments2.argument(this, EXTRA_LAYOUT_WIDTH, -1);
        this.dialogHeight = Fragments2.argument(this, EXTRA_LAYOUT_HEIGHT, -2);
        this.useParentFragmentScarletContextWrapper = Fragments2.argument(this, EXTRA_USE_PARENT_FRAGMENT_SCARLET_CONTEXT, bool);
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    protected final ImageView getImageView() {
        return (ImageView) this.imageView.getValue(this, $$delegatedProperties[0]);
    }

    protected final RdsPogView getPogView() {
        return (RdsPogView) this.pogView.getValue(this, $$delegatedProperties[1]);
    }

    protected final TextView getTitleTxt() {
        return (TextView) this.titleTxt.getValue(this, $$delegatedProperties[2]);
    }

    protected final TextView getMessageTxt() {
        return (TextView) this.messageTxt.getValue(this, $$delegatedProperties[3]);
    }

    protected final TextView getAdditionalTxt() {
        return (TextView) this.additionalTxt.getValue(this, $$delegatedProperties[4]);
    }

    protected final TextView getNegativeBtn() {
        return (TextView) this.negativeBtn.getValue(this, $$delegatedProperties[5]);
    }

    protected final TextView getPositiveBtn() {
        return (TextView) this.positiveBtn.getValue(this, $$delegatedProperties[6]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    public int getDialogId() {
        return ((Number) this.dialogId.getValue()).intValue();
    }

    private final int getImageResId() {
        return ((Number) this.imageResId.getValue()).intValue();
    }

    private final int getPogPictogramId() {
        return ((Number) this.pogPictogramId.getValue()).intValue();
    }

    private final CharSequence getPogText() {
        return (CharSequence) this.pogText.getValue();
    }

    private final boolean getUseDesignSystemOverlay() {
        return ((Boolean) this.useDesignSystemOverlay.getValue()).booleanValue();
    }

    private final Bundle getPassthroughArgs() {
        return (Bundle) this.passthroughArgs.getValue();
    }

    private final ResourceReferences4<ColorStateList> getImageTint() {
        return (ResourceReferences4) this.imageTint.getValue();
    }

    private final CharSequence getTitle() {
        return (CharSequence) this.title.getValue();
    }

    protected CharSequence getMessage() {
        return (CharSequence) this.message.getValue();
    }

    private final boolean getDismissOnLinkTextClick() {
        return ((Boolean) this.dismissOnLinkTextClick.getValue()).booleanValue();
    }

    private final CharSequence getAdditionalMessage() {
        return (CharSequence) this.additionalMessage.getValue();
    }

    private final CharSequence getPositiveText() {
        return (CharSequence) this.positiveText.getValue();
    }

    private final CharSequence getNegativeText() {
        return (CharSequence) this.negativeText.getValue();
    }

    protected final Boolean getCancelable() {
        return (Boolean) this.cancelable.getValue();
    }

    protected int getLayoutResId() {
        return this.layoutResId;
    }

    protected void setLayoutResId(int i) {
        this.layoutResId = i;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    protected final int getDialogWidth() {
        return ((Number) this.dialogWidth.getValue()).intValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    protected final int getDialogHeight() {
        return ((Number) this.dialogHeight.getValue()).intValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    protected boolean getUseParentFragmentScarletContextWrapper() {
        return ((Boolean) this.useParentFragmentScarletContextWrapper.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    /* renamed from: getTheme, reason: from getter */
    public int getThemeResId() {
        return this.themeResId;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (getUseDesignSystemOverlay()) {
            ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
            putDesignSystemOverlay(scarletContextWrapper);
            setScarletContextWrapper(scarletContextWrapper);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            logDialogAnalytics();
        }
        Bundle bundleRequireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments, "requireArguments(...)");
        this.themeResId = bundleRequireArguments.getInt(EXTRA_THEME, 0);
        setLayoutResId(bundleRequireArguments.getInt(EXTRA_LAYOUT_RES, 0));
    }

    protected void logDialogAnalytics() {
        String tag = getTag();
        CharSequence title = getTitle();
        if (tag == null) {
            tag = "no-tag";
        }
        String str = "AndroidDialog-" + tag;
        StringBuilder sb = new StringBuilder();
        if (title != null) {
            sb.append(title);
            sb.append(" -- ");
        }
        sb.append(getMessage());
        getAnalytics().buildSimpleTransitionEvent(str, sb.toString()).send();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (this.themeResId == 0) {
            Context contextResolveScarletContextWrapper = resolveScarletContextWrapper();
            if (contextResolveScarletContextWrapper == null) {
                contextResolveScarletContextWrapper = requireContext();
            }
            Intrinsics.checkNotNull(contextResolveScarletContextWrapper);
            Resources.Theme theme = contextResolveScarletContextWrapper.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            TypedValue typedValueResolveAttribute$default = Themes3.resolveAttribute$default(theme, R.attr.dialogTheme, false, 2, null);
            this.themeResId = typedValueResolveAttribute$default != null ? typedValueResolveAttribute$default.resourceId : 0;
        }
        if (this.themeResId != 0) {
            ScarletContextWrapper scarletContextWrapperResolveScarletContextWrapper = resolveScarletContextWrapper();
            if (scarletContextWrapperResolveScarletContextWrapper == null) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                scarletContextWrapperResolveScarletContextWrapper = new ScarletContextWrapper(contextRequireContext, null, new DirectResourceReference(ResourceType.STYLE.INSTANCE, this.themeResId), 2, null);
            }
            if (getLayoutResId() == 0) {
                TypedValue typedValueResolveAttribute$default2 = Themes3.resolveAttribute$default(scarletContextWrapperResolveScarletContextWrapper.getTheme(), C13997R.attr.dialogLayout, false, 2, null);
                Integer numValueOf = typedValueResolveAttribute$default2 != null ? Integer.valueOf(typedValueResolveAttribute$default2.resourceId) : null;
                if (numValueOf == null || numValueOf.intValue() == 0) {
                    iIntValue = C11048R.layout.dialog_fragment;
                } else {
                    iIntValue = numValueOf.intValue();
                }
                setLayoutResId(iIntValue);
            }
            inflater = ContextSystemServices.getLayoutInflater(scarletContextWrapperResolveScarletContextWrapper);
        }
        return createView(inflater, container);
    }

    private final View createView(LayoutInflater inflater, ViewGroup container) {
        View viewInflate = inflater.inflate(C11048R.layout.fragment_dialog_design_system_wrapper, container, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        inflater.inflate(getLayoutResId(), viewGroup, true);
        return viewGroup;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        CharSequence text;
        CharSequence text2;
        RdsPogView pogView;
        RdsPogView pogView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        TextView positiveBtn = getPositiveBtn();
        if (positiveBtn != null) {
            OnClickListeners.onClick(positiveBtn, new Function0() { // from class: com.robinhood.android.common.ui.RhDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhDialogFragment.onViewCreated$lambda$2(this.f$0);
                }
            });
        }
        TextView negativeBtn = getNegativeBtn();
        if (negativeBtn != null) {
            OnClickListeners.onClick(negativeBtn, new Function0() { // from class: com.robinhood.android.common.ui.RhDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhDialogFragment.onViewCreated$lambda$3(this.f$0);
                }
            });
        }
        if (getImageResId() != 0) {
            ImageView imageView = getImageView();
            Intrinsics.checkNotNull(imageView);
            imageView.setVisibility(0);
            imageView.setImageResource(getImageResId());
            ResourceReferences4<ColorStateList> imageTint = getImageTint();
            if (imageTint != null) {
                Resources.Theme theme = imageView.getContext().getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                ColorStateList colorStateListResolve = imageTint.resolve(theme);
                if (colorStateListResolve != null) {
                    imageView.setImageTintList(colorStateListResolve);
                }
            }
        }
        if (getPogPictogramId() != 0 && (pogView2 = getPogView()) != null) {
            pogView2.setPictogram(ViewsKt.getDrawable(pogView2, getPogPictogramId()));
            pogView2.setVisibility(0);
        }
        CharSequence pogText = getPogText();
        if (pogText != null && pogText.length() != 0 && (pogView = getPogView()) != null) {
            pogView.setText(getPogText());
            pogView.setVisibility(0);
        }
        TextView titleTxt = getTitleTxt();
        TextView messageTxt = getMessageTxt();
        TextView additionalTxt = getAdditionalTxt();
        TextView positiveBtn2 = getPositiveBtn();
        TextView negativeBtn2 = getNegativeBtn();
        CharSequence title = getTitle();
        if (title != null && title.length() != 0) {
            Intrinsics.checkNotNull(titleTxt);
            titleTxt.setText(title);
        }
        if (titleTxt != null && ((text2 = titleTxt.getText()) == null || text2.length() == 0)) {
            titleTxt.setVisibility(8);
        }
        CharSequence message = getMessage();
        if (message != null && message.length() != 0) {
            Intrinsics.checkNotNull(messageTxt);
            messageTxt.setText(message);
            BetterLinkMovementMethod betterLinkMovementMethodNewInstance = BetterLinkMovementMethod.newInstance();
            betterLinkMovementMethodNewInstance.setOnLinkClickListener(new BetterLinkMovementMethod.OnLinkClickListener() { // from class: com.robinhood.android.common.ui.RhDialogFragment.onViewCreated.6
                @Override // me.saket.bettermovementmethod.BetterLinkMovementMethod.OnLinkClickListener
                public final boolean onClick(TextView textView, String str) {
                    RhDialogFragment rhDialogFragment = RhDialogFragment.this;
                    Intrinsics.checkNotNull(str);
                    return rhDialogFragment.onLinkTextClick(str);
                }
            });
            messageTxt.setMovementMethod(betterLinkMovementMethodNewInstance);
        }
        CharSequence additionalMessage = getAdditionalMessage();
        if (additionalTxt != null && additionalMessage != null && additionalMessage.length() != 0) {
            additionalTxt.setText(additionalMessage);
            additionalTxt.setVisibility(0);
            BetterLinkMovementMethod betterLinkMovementMethodNewInstance2 = BetterLinkMovementMethod.newInstance();
            betterLinkMovementMethodNewInstance2.setOnLinkClickListener(new BetterLinkMovementMethod.OnLinkClickListener() { // from class: com.robinhood.android.common.ui.RhDialogFragment.onViewCreated.7
                @Override // me.saket.bettermovementmethod.BetterLinkMovementMethod.OnLinkClickListener
                public final boolean onClick(TextView textView, String str) {
                    RhDialogFragment rhDialogFragment = RhDialogFragment.this;
                    Intrinsics.checkNotNull(str);
                    return rhDialogFragment.onLinkTextClick(str);
                }
            });
            additionalTxt.setMovementMethod(betterLinkMovementMethodNewInstance2);
        }
        Boolean cancelable = getCancelable();
        if (cancelable != null) {
            setCancelable(cancelable.booleanValue());
        }
        CharSequence positiveText = getPositiveText();
        if (positiveBtn2 != null && positiveText != null && positiveText.length() != 0) {
            positiveBtn2.setText(positiveText);
        }
        CharSequence negativeText = getNegativeText();
        if (negativeBtn2 != null && negativeText != null && negativeText.length() != 0) {
            negativeBtn2.setText(negativeText);
        }
        if (negativeBtn2 != null && ((text = negativeBtn2.getText()) == null || text.length() == 0)) {
            negativeBtn2.setVisibility(8);
        } else {
            Boolean cancelable2 = getCancelable();
            setCancelable(cancelable2 != null ? cancelable2.booleanValue() : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(RhDialogFragment rhDialogFragment) {
        if (!rhDialogFragment.isStateSaved()) {
            rhDialogFragment.onPositiveButtonClick();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(RhDialogFragment rhDialogFragment) {
        if (!rhDialogFragment.isStateSaved()) {
            rhDialogFragment.onNegativeButtonClick();
        }
        return Unit.INSTANCE;
    }

    protected void onPositiveButtonClick() {
        dismissAllowingStateLoss();
        BaseActivity baseActivity = Fragments2.getBaseActivity(this);
        ActivityResultCaller currentFragment = baseActivity.getCurrentFragment();
        boolean zOnPositiveButtonClicked = currentFragment instanceof OnClickListener ? ((OnClickListener) currentFragment).onPositiveButtonClicked(getDialogId(), getPassthroughArgs()) : false;
        if (!zOnPositiveButtonClicked) {
            zOnPositiveButtonClicked = baseActivity.onPositiveButtonClicked(getDialogId(), getPassthroughArgs());
        }
        if (zOnPositiveButtonClicked) {
            return;
        }
        setDialogFragmentResult("rhPositive");
    }

    protected void onNegativeButtonClick() {
        dismissAllowingStateLoss();
        BaseActivity baseActivity = Fragments2.getBaseActivity(this);
        ActivityResultCaller currentFragment = baseActivity.getCurrentFragment();
        boolean zOnNegativeButtonClicked = currentFragment instanceof OnClickListener ? ((OnClickListener) currentFragment).onNegativeButtonClicked(getDialogId(), getPassthroughArgs()) : false;
        if (!zOnNegativeButtonClicked) {
            zOnNegativeButtonClicked = baseActivity.onNegativeButtonClicked(getDialogId(), getPassthroughArgs());
        }
        if (zOnNegativeButtonClicked) {
            return;
        }
        setDialogFragmentResult("rhNegative");
    }

    protected boolean onLinkTextClick(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (getDismissOnLinkTextClick()) {
            dismissAllowingStateLoss();
        }
        BaseActivity baseActivity = Fragments2.getBaseActivity(this);
        ActivityResultCaller currentFragment = baseActivity.getCurrentFragment();
        boolean zOnLinkTextClicked = currentFragment instanceof OnClickListener ? ((OnClickListener) currentFragment).onLinkTextClicked(getDialogId(), getPassthroughArgs(), url) : false;
        return !zOnLinkTextClicked ? baseActivity.onLinkTextClicked(getDialogId(), getPassthroughArgs(), url) : zOnLinkTextClicked;
    }

    private final void setDialogFragmentResult(String type2) {
        getParentFragmentManager().setFragmentResult(REQUEST_KEY, Bundle2.bundleOf(Tuples4.m3642to(RESULT_KEY_TYPE, type2), Tuples4.m3642to(RESULT_KEY_DIALOG_ID, Integer.valueOf(getDialogId())), Tuples4.m3642to("rhPassthroughArgs", getPassthroughArgs())));
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    public void onDismiss(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        PrimaryFragmentHost baseActivity = Fragments2.getBaseActivity(this);
        ActivityResultCaller currentFragment = baseActivity.getCurrentFragment();
        if (currentFragment instanceof OnDismissListener) {
            ((OnDismissListener) currentFragment).onDialogDismissed(getDialogId());
        }
        if (baseActivity instanceof OnDismissListener) {
            ((OnDismissListener) baseActivity).onDialogDismissed(getDialogId());
        }
    }

    /* compiled from: RhDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u000eJ\u0010\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u000eJ\u0014\u0010\u0018\u001a\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0010\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u001d\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000eJ\u0010\u0010 \u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\"J\u0010\u0010#\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\"J-\u0010#\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u000e2\u0016\u0010%\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010&\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010'J\u0012\u0010(\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\"H\u0016J-\u0010(\u001a\u00020\u00002\b\b\u0001\u0010*\u001a\u00020\u000e2\u0016\u0010%\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010&\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010'J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0015J\u0010\u0010-\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\"J-\u0010-\u001a\u00020\u00002\b\b\u0001\u0010*\u001a\u00020\u000e2\u0016\u0010%\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010&\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010'J\u0012\u0010.\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010\"H\u0016J/\u0010.\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u000e2\u0016\u0010%\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010&\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010'J\u0012\u00100\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010\"H\u0016J/\u00100\u001a\u00020\u00002\b\b\u0001\u00101\u001a\u00020\u000e2\u0016\u0010%\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010&\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010'J\u0010\u00102\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u000eJ\u000e\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\tJ\u000e\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0015J\u000e\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0015J\b\u00109\u001a\u00020:H\u0014J\"\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?2\b\b\u0002\u0010@\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "dialogArgs", "Landroid/os/Bundle;", "getDialogArgs", "()Landroid/os/Bundle;", "setId", "id", "", "setLayoutRes", "layoutRes", "setLayoutWidthResource", "resId", "setCancelable", "cancelable", "", "setImage", "imageId", "setImageTint", "reference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Landroid/content/res/ColorStateList;", "setImageTintResource", "setImageTintThemeAttribute", "setPogPictogram", "pictogramId", "setPogText", "text", "", "setTitle", "title", "args", "", "(I[Ljava/lang/Object;)Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "setMessage", "message", "messageRes", "setDismissOnLinkTextClick", "dismissOnLinkTextClick", "setAdditionalMessage", "setPositiveButton", "buttonText", "setNegativeButton", "buttonRes", "setTheme", "setPassthroughArgs", "passthroughArgs", "setUseDesignSystemOverlay", "useDesignSystemStyle", "setUseParentFragmentScarletContext", "useParentFragmentScarletContext", "createDialogFragment", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "show", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "tag", "", "showNow", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static class Builder {
        public static final int $stable = 8;
        private final Context context;
        private final Bundle dialogArgs;

        public Builder(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            this.dialogArgs = new Bundle();
        }

        public final Context getContext() {
            return this.context;
        }

        public final Bundle getDialogArgs() {
            return this.dialogArgs;
        }

        public final Builder setId(int id) {
            this.dialogArgs.putInt(RhDialogFragment.EXTRA_ID, id);
            return this;
        }

        public final Builder setLayoutRes(int layoutRes) {
            this.dialogArgs.putInt(RhDialogFragment.EXTRA_LAYOUT_RES, layoutRes);
            return this;
        }

        public final Builder setLayoutWidthResource(int resId) {
            this.dialogArgs.putInt(RhDialogFragment.EXTRA_LAYOUT_WIDTH, this.context.getResources().getDimensionPixelOffset(resId));
            return this;
        }

        public final Builder setCancelable(boolean cancelable) {
            this.dialogArgs.putBoolean(RhDialogFragment.EXTRA_CANCELABLE, cancelable);
            return this;
        }

        public final Builder setImage(int imageId) {
            this.dialogArgs.putInt(RhDialogFragment.EXTRA_IMAGE_ID, imageId);
            return this;
        }

        public final Builder setImageTint(ResourceReferences4<? extends ColorStateList> reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            this.dialogArgs.putParcelable(RhDialogFragment.EXTRA_IMAGE_TINT, reference);
            return this;
        }

        public final Builder setImageTintResource(int resId) {
            setImageTint(new DirectResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, resId));
            return this;
        }

        public final Builder setImageTintThemeAttribute(int resId) {
            setImageTint(new ThemedResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, resId));
            return this;
        }

        public final Builder setPogPictogram(int pictogramId) {
            this.dialogArgs.putInt(RhDialogFragment.EXTRA_POG_PICTOGRAM_ID, pictogramId);
            return this;
        }

        public final Builder setPogText(CharSequence text) {
            this.dialogArgs.putCharSequence(RhDialogFragment.EXTRA_POG_TEXT, text);
            return this;
        }

        public final Builder setTitle(CharSequence title) {
            this.dialogArgs.putCharSequence(RhDialogFragment.EXTRA_TITLE, title);
            return this;
        }

        public final Builder setTitle(int resId, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return setTitle(this.context.getString(resId, Arrays.copyOf(args, args.length)));
        }

        public Builder setMessage(CharSequence message) {
            this.dialogArgs.putCharSequence(RhDialogFragment.EXTRA_MESSAGE, message);
            return this;
        }

        public final Builder setMessage(int messageRes, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            setMessage(this.context.getString(messageRes, Arrays.copyOf(args, args.length)));
            return this;
        }

        public final Builder setDismissOnLinkTextClick(boolean dismissOnLinkTextClick) {
            this.dialogArgs.putBoolean(RhDialogFragment.EXTRA_DISMISS_ON_LINK_TEXT_CLICK, dismissOnLinkTextClick);
            return this;
        }

        public final Builder setAdditionalMessage(CharSequence message) {
            this.dialogArgs.putCharSequence(RhDialogFragment.EXTRA_ADDITIONAL_MESSAGE, message);
            return this;
        }

        public final Builder setAdditionalMessage(int messageRes, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            setAdditionalMessage(this.context.getString(messageRes, Arrays.copyOf(args, args.length)));
            return this;
        }

        public Builder setPositiveButton(CharSequence buttonText) {
            this.dialogArgs.putCharSequence("rhPositive", buttonText);
            return this;
        }

        public Builder setPositiveButton(int resId, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            setPositiveButton(this.context.getString(resId, Arrays.copyOf(args, args.length)));
            return this;
        }

        public Builder setNegativeButton(CharSequence buttonText) {
            this.dialogArgs.putCharSequence("rhNegative", buttonText);
            return this;
        }

        public Builder setNegativeButton(int buttonRes, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            setNegativeButton(this.context.getString(buttonRes, Arrays.copyOf(args, args.length)));
            return this;
        }

        public final Builder setTheme(int resId) {
            this.dialogArgs.putInt(RhDialogFragment.EXTRA_THEME, resId);
            return this;
        }

        public final Builder setPassthroughArgs(Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(passthroughArgs, "passthroughArgs");
            this.dialogArgs.putParcelable("rhPassthroughArgs", passthroughArgs);
            return this;
        }

        public final Builder setUseDesignSystemOverlay(boolean useDesignSystemStyle) {
            this.dialogArgs.putBoolean(RhDialogFragment.EXTRA_USE_DESIGN_SYSTEM_OVERLAY, useDesignSystemStyle);
            return this;
        }

        public final Builder setUseParentFragmentScarletContext(boolean useParentFragmentScarletContext) {
            this.dialogArgs.putBoolean(RhDialogFragment.EXTRA_USE_PARENT_FRAGMENT_SCARLET_CONTEXT, useParentFragmentScarletContext);
            return this;
        }

        protected RhDialogFragment createDialogFragment() {
            return new RhDialogFragment();
        }

        public static /* synthetic */ RhDialogFragment show$default(Builder builder, FragmentManager fragmentManager, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return builder.show(fragmentManager, str, z);
        }

        public final RhDialogFragment show(FragmentManager fragmentManager, String tag, boolean showNow) {
            Fragment fragmentFindFragmentByTag;
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            RhDialogFragment rhDialogFragmentCreateDialogFragment = createDialogFragment();
            Bundle arguments = rhDialogFragmentCreateDialogFragment.getArguments();
            if (arguments != null) {
                arguments.putAll(this.dialogArgs);
            } else {
                arguments = this.dialogArgs;
            }
            rhDialogFragmentCreateDialogFragment.setArguments(arguments);
            try {
                fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(tag);
            } catch (IllegalStateException unused) {
            }
            if (fragmentFindFragmentByTag != null) {
                Timber.INSTANCE.mo3362w("Debouncing duplicate dialog: %s", tag);
                return (RhDialogFragment) fragmentFindFragmentByTag;
            }
            if (showNow) {
                rhDialogFragmentCreateDialogFragment.showNow(fragmentManager, tag);
                return rhDialogFragmentCreateDialogFragment;
            }
            rhDialogFragmentCreateDialogFragment.show(fragmentManager, tag);
            return rhDialogFragmentCreateDialogFragment;
        }
    }

    /* compiled from: RhDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0084T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhDialogFragment$Companion;", "", "<init>", "()V", "EXTRA_CANCELABLE", "", "EXTRA_ID", "EXTRA_LAYOUT_RES", "EXTRA_LAYOUT_WIDTH", "EXTRA_LAYOUT_HEIGHT", "EXTRA_IMAGE_ID", "EXTRA_IMAGE_TINT", "EXTRA_POG_PICTOGRAM_ID", "EXTRA_POG_TEXT", "EXTRA_TITLE", "EXTRA_MESSAGE", "EXTRA_ADDITIONAL_MESSAGE", "EXTRA_POSITIVE_BUTTON_TEXT", "EXTRA_NEGATIVE_BUTTON_TEXT", "EXTRA_THEME", "EXTRA_PASSTHROUGH_ARGS", "EXTRA_USE_DESIGN_SYSTEM_OVERLAY", "EXTRA_USE_PARENT_FRAGMENT_SCARLET_CONTEXT", "EXTRA_DISMISS_ON_LINK_TEXT_CLICK", "REQUEST_KEY", "RESULT_KEY_TYPE", "RESULT_KEY_DIALOG_ID", "RESULT_KEY_PASSTHROUGH_ARGS", "RESULT_POSITIVE", "RESULT_NEGATIVE", "RESULT_LINK_TEXT", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "context", "Landroid/content/Context;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Builder create(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Builder(context);
        }
    }
}
