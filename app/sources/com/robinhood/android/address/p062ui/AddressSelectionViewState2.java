package com.robinhood.android.address.p062ui;

import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/address/ui/ViewType;", "", "<init>", "()V", "Prediction", "ManualInput", "Lcom/robinhood/android/address/ui/ViewType$ManualInput;", "Lcom/robinhood/android/address/ui/ViewType$Prediction;", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.address.ui.ViewType, reason: use source file name */
/* loaded from: classes24.dex */
public abstract class AddressSelectionViewState2 {
    public /* synthetic */ AddressSelectionViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: AddressSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/address/ui/ViewType$Prediction;", "Lcom/robinhood/android/address/ui/ViewType;", WebsocketGatewayConstants.DATA_KEY, "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "<init>", "(Lcom/google/android/libraries/places/api/model/AutocompletePrediction;)V", "getData", "()Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.address.ui.ViewType$Prediction */
    public static final class Prediction extends AddressSelectionViewState2 {
        private final AutocompletePrediction data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Prediction(AutocompletePrediction data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final AutocompletePrediction getData() {
            return this.data;
        }
    }

    private AddressSelectionViewState2() {
    }

    /* compiled from: AddressSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/address/ui/ViewType$ManualInput;", "Lcom/robinhood/android/address/ui/ViewType;", "<init>", "()V", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.address.ui.ViewType$ManualInput */
    public static final class ManualInput extends AddressSelectionViewState2 {
        public static final ManualInput INSTANCE = new ManualInput();

        private ManualInput() {
            super(null);
        }
    }
}
