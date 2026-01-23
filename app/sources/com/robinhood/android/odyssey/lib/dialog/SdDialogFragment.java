package com.robinhood.android.odyssey.lib.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.odyssey.lib.view.SdTextUtil;
import com.robinhood.models.api.serverdrivenui.component.ApiSdButtonComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPictogramPog;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPog;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPopup;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextPog;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextSubComponent;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.fragment.PrimaryFragmentHost;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0003\b\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/dialog/SdDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "<init>", "()V", "onCancel", "", "dialog", "Landroid/content/DialogInterface;", "OnCancelListener", "Builder", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class SdDialogFragment extends RhDialogFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = RhDialogFragment.$stable;

    /* compiled from: SdDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/dialog/SdDialogFragment$OnCancelListener;", "", "onDialogCancelled", "", "id", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface OnCancelListener {
        void onDialogCancelled(int id);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        PrimaryFragmentHost baseActivity = Fragments2.getBaseActivity(this);
        ActivityResultCaller currentFragment = baseActivity.getCurrentFragment();
        if (currentFragment instanceof OnCancelListener) {
            ((OnCancelListener) currentFragment).onDialogCancelled(getDialogId());
        }
        if (baseActivity instanceof OnCancelListener) {
            ((OnCancelListener) baseActivity).onDialogCancelled(getDialogId());
        }
    }

    /* compiled from: SdDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/dialog/SdDialogFragment$Builder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "createDialogFragment", "Lcom/robinhood/android/odyssey/lib/dialog/SdDialogFragment;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Builder extends RhDialogFragment.Builder {
        public static final int $stable = RhDialogFragment.Builder.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        public SdDialogFragment createDialogFragment() {
            return new SdDialogFragment();
        }
    }

    /* compiled from: SdDialogFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/dialog/SdDialogFragment$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/odyssey/lib/dialog/SdDialogFragment$Builder;", "context", "Landroid/content/Context;", "popup", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPopup;", "handleDeepLink", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "url", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Builder create(Context context, ApiSdPopup popup, Function1<? super Uri, Unit> handleDeepLink) {
            ApiSdButtonComponent.ApiSdButtonComponentData data;
            ApiSdButtonComponent.ApiSdButtonComponentData data2;
            ApiSdTextComponentData data3;
            ApiSdTextComponentData data4;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(popup, "popup");
            Intrinsics.checkNotNullParameter(handleDeepLink, "handleDeepLink");
            Builder builder = new Builder(context);
            String id = popup.getId();
            builder.setId(id != null ? id.hashCode() : 0);
            ApiSdTextSubComponent title = popup.getTitle();
            String text = null;
            builder.setTitle((title == null || (data4 = title.getData()) == null) ? null : SdTextUtil.buildSpannableStringForPopup(data4, context, handleDeepLink));
            ApiSdTextSubComponent subtitle = popup.getSubtitle();
            builder.setMessage((subtitle == null || (data3 = subtitle.getData()) == null) ? null : SdTextUtil.buildSpannableStringForPopup(data3, context, handleDeepLink));
            ApiSdButtonComponent primary_cta = popup.getPrimary_cta();
            builder.setPositiveButton((primary_cta == null || (data2 = primary_cta.getData()) == null) ? null : data2.getText());
            ApiSdButtonComponent secondary_cta = popup.getSecondary_cta();
            if (secondary_cta != null && (data = secondary_cta.getData()) != null) {
                text = data.getText();
            }
            builder.setNegativeButton(text);
            ApiSdPog pog = popup.getPog();
            if (pog instanceof ApiSdPictogramPog) {
                builder.setPogPictogram(((ApiSdPictogramPog) pog).getData().getPictogram().getResourceId());
                return builder;
            }
            if (pog instanceof ApiSdTextPog) {
                builder.setPogText(((ApiSdTextPog) pog).getData().getText());
                return builder;
            }
            if (pog instanceof ApiSdPog.UnknownPog) {
                Preconditions.INSTANCE.failUnknownEnumKotlin("unknown pog type");
                throw new ExceptionsH();
            }
            if (pog != null) {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit = Unit.INSTANCE;
            return builder;
        }
    }
}
