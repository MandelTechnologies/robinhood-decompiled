package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.robinhood.android.designsystem.row.RdsSettingsRowView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdSettingsRow;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdSettingsRow.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001\u001cB\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdSettingsRow;", "Lcom/robinhood/android/designsystem/row/RdsSettingsRowView;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdSettingsRow;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdSettingsRow$Data;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdSettingsRow$Data;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdSettingsRow$Data;)V", "mergeNewData", "newData", "onFinishInflate", "", "onDataUpdated", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdSettingsRow extends RdsSettingsRowView implements SdBaseView<ApiSdSettingsRow, ApiSdSettingsRow.Data, SdBaseView.Callbacks> {
    private ApiSdSettingsRow.Data data;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdSettingsRow apiSdSettingsRow) {
        SdBaseView.DefaultImpls.bind(this, apiSdSettingsRow);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onRestoreState(Parcelable parcelable) {
        return SdBaseView.DefaultImpls.onRestoreState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onSaveState(Parcelable parcelable) {
        return SdBaseView.DefaultImpls.onSaveState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdTypedValue onSubmitValue() {
        return SdBaseView.DefaultImpls.onSubmitValue(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Map<String, ApiSdTypedValue> requireAlternateComponentOnSubmitValueMap() {
        return SdBaseView.DefaultImpls.requireAlternateComponentOnSubmitValueMap(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public SdBaseView.Callbacks requireComponentCallbacks() {
        return SdBaseView.DefaultImpls.requireComponentCallbacks(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public View requireSdView() {
        return SdBaseView.DefaultImpls.requireSdView(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void update(ApiSdSettingsRow.Data data, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.update(this, data, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdSettingsRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdSettingsRow.Data getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdSettingsRow.Data data) {
        this.data = data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdSettingsRow.Data mergeNewData(ApiSdSettingsRow.Data newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdSettingsRow.Data) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdSettingsRow.Data.class), newData);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.odyssey.lib.view.SdSettingsRow$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SdSettingsRow.onFinishInflate$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$1(SdSettingsRow sdSettingsRow) {
        ApiSdAction on_click;
        ApiSdSettingsRow.Data data = sdSettingsRow.getData();
        if (data != null && (on_click = data.getOn_click()) != null) {
            SdBaseView.Callbacks callbacksRequireComponentCallbacks = sdSettingsRow.requireComponentCallbacks();
            ApiSdSettingsRow.Data data2 = sdSettingsRow.getData();
            callbacksRequireComponentCallbacks.onComponentAction(data2 != null ? data2.getId() : null, on_click);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdSettingsRow.Data newData, SdBaseView.UpdateSource updateSource) {
        ResourceReferences4<Integer> resourceReferences4MapColor;
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        String label = newData.getLabel();
        if (label != null) {
            new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.odyssey.lib.view.SdSettingsRow$onDataUpdated$1$2
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((SdSettingsRow) this.receiver).getLabelText();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((SdSettingsRow) this.receiver).setLabelText((CharSequence) obj);
                }
            }.set(label);
        }
        String value = newData.getValue();
        if (value != null) {
            new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.odyssey.lib.view.SdSettingsRow$onDataUpdated$1$4
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((SdSettingsRow) this.receiver).getValueText();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((SdSettingsRow) this.receiver).setValueText((CharSequence) obj);
                }
            }.set(value);
        }
        String metadata = newData.getMetadata();
        if (metadata != null) {
            new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.odyssey.lib.view.SdSettingsRow$onDataUpdated$1$6
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((SdSettingsRow) this.receiver).getMetadataText();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((SdSettingsRow) this.receiver).setMetadataText((CharSequence) obj);
                }
            }.set(metadata);
        }
        ThemedColor metadata_color = newData.getMetadata_color();
        if (metadata_color != null && (resourceReferences4MapColor = ServerToBentoColorMapper.INSTANCE.mapColor(metadata_color)) != null) {
            setMetadataTextColor(resourceReferences4MapColor);
        }
        ServerToBentoAssetMapper2 icon = newData.getIcon();
        Integer numValueOf = icon != null ? Integer.valueOf(icon.getResourceId()) : null;
        if (numValueOf != null) {
            setTrailingIcon(ContextCompat.getDrawable(getContext(), numValueOf.intValue()));
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return onSaveState(super.onSaveInstanceState());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(onRestoreState(state));
    }

    /* compiled from: SdSettingsRow.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdSettingsRow$Companion;", "", "<init>", "()V", "inflate", "Lcom/robinhood/android/odyssey/lib/view/SdSettingsRow;", "parent", "Landroid/view/ViewGroup;", "row", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdSettingsRow;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {

        /* compiled from: SdSettingsRow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiSdSettingsRow.Mode.values().length];
                try {
                    iArr[ApiSdSettingsRow.Mode.STACKED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiSdSettingsRow.Mode.CONDENSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SdSettingsRow inflate(ViewGroup parent, ApiSdSettingsRow row) {
            int i;
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(row, "row");
            ApiSdSettingsRow.Mode mode = row.getData().getMode();
            int i2 = mode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
            if (i2 == -1 || i2 == 1) {
                i = C20335R.layout.include_sd_settings_row_stacked;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C20335R.layout.include_sd_settings_row_condensed;
            }
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            View viewInflate = ContextSystemServices.getLayoutInflater(context).inflate(i, parent, false);
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.view.SdSettingsRow");
            return (SdSettingsRow) viewInflate;
        }
    }
}
