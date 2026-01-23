package com.robinhood.microgram.sdui;

import android.os.Parcelable;
import com.robinhood.microgram.sdui.RouterMessage;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RouterMessage.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/EmbeddedSectionMessage;", "Landroid/os/Parcelable;", "AdapterModule", "Lcom/robinhood/microgram/sdui/RouterMessage$OpenDeeplink;", "Lcom/robinhood/microgram/sdui/RouterMessage$PresentAlert;", "Lcom/robinhood/microgram/sdui/RouterMessage$PresentBottomSheet;", "Lcom/robinhood/microgram/sdui/RouterMessage$PresentSystemDefaultShareContents;", "Lcom/robinhood/microgram/sdui/RouterMessage$PresentSystemDefaultShareLink;", "Lcom/robinhood/microgram/sdui/RouterMessage$PresentToast;", "Lcom/robinhood/microgram/sdui/RouterMessage$ShowRouter;", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.sdui.EmbeddedSectionMessage, reason: use source file name */
/* loaded from: classes20.dex */
public interface RouterMessage2 extends Parcelable {

    /* compiled from: RouterMessage.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/EmbeddedSectionMessage$AdapterModule;", "", "<init>", "()V", "provideAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.EmbeddedSectionMessage$AdapterModule */
    public static final class AdapterModule {
        public static final AdapterModule INSTANCE = new AdapterModule();

        private AdapterModule() {
        }

        public final JsonAdapter.Factory provideAdapterFactory() {
            PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(RouterMessage2.class, "message_type").withSubtype(RouterMessage.PresentAlert.class, "PRESENT_ALERT").withSubtype(RouterMessage.PresentBottomSheet.class, "PRESENT_BOTTOM_SHEET").withSubtype(RouterMessage.ShowRouter.class, "SHOW_ROUTER").withSubtype(RouterMessage.OpenDeeplink.class, "OPEN_DEEPLINK").withSubtype(RouterMessage.PresentToast.class, "PRESENT_TOAST").withSubtype(RouterMessage.PresentSystemDefaultShareLink.class, "PRESENT_SYSTEM_DEFAULT_SHARE_LINK").withSubtype(RouterMessage.PresentSystemDefaultShareContents.class, "PRESENT_SYSTEM_DEFAULT_SHARE_CONTENTS");
            Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
            return polymorphicJsonAdapterFactoryWithSubtype;
        }
    }
}
