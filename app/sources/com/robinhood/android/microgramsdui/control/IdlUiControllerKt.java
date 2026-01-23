package com.robinhood.android.microgramsdui.control;

import com.robinhood.models.serverdriven.experimental.api.ComponentState;
import com.robinhood.models.serverdriven.experimental.api.SelectRowState;
import com.robinhood.models.serverdriven.experimental.api.TableInstrumentNameState;
import com.robinhood.models.serverdriven.experimental.api.TextAreaState;
import com.robinhood.models.serverdriven.experimental.api.TextInputState;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import microgram.Message;
import rh_server_driven_ui.p531v1.ComponentStateDto;
import rh_server_driven_ui.p531v1.TextInputDto;

/* compiled from: IdlUiController.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0002¢\u0006\u0002\u0010\u0005\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002¨\u0006\t"}, m3636d2 = {"toMessage", "Lmicrogram/Message;", "T", "Lcom/squareup/moshi/JsonAdapter;", "value", "(Lcom/squareup/moshi/JsonAdapter;Ljava/lang/Object;)Lmicrogram/Message;", "toDto", "Lrh_server_driven_ui/v1/ComponentStateDto;", "Lcom/robinhood/models/serverdriven/experimental/api/ComponentState;", "lib-microgram-sdui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class IdlUiControllerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Message toMessage(JsonAdapter<T> jsonAdapter, T t) {
        return new Message(jsonAdapter.toJson(t), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComponentStateDto toDto(ComponentState componentState) {
        ComponentStateDto.ConcreteDto.TextInput textInput;
        if (componentState instanceof TextInputState) {
            textInput = new ComponentStateDto.ConcreteDto.TextInput(new TextInputDto.StateDto(((TextInputState) componentState).getText()));
        } else {
            if (!(componentState instanceof SelectRowState) && !(componentState instanceof TableInstrumentNameState) && !(componentState instanceof TextAreaState)) {
                throw new NoWhenBranchMatchedException();
            }
            textInput = null;
        }
        return new ComponentStateDto(textInput);
    }
}
