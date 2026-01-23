package com.robinhood.microgram.sdui;

import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.ScreenDto;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.p507ui.p508v1.HtmlCanvasScreenContentDto;
import microgram.p507ui.p508v1.LoggingContextDto;
import microgram.p507ui.p508v1.StandardScreenContentDto;
import okio.Buffer;
import okio.ByteString;

/* compiled from: LoggingUtils.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0082\b\u001a\u0016\u0010\u0007\u001a\u00020\b*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\tj\u0002`\n\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u000b\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\f\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\r\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u000e\u001a\u001e\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011*\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\tj\u0002`\u0014\u001a\u000e\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011*\u00020\u0012\u001a\u000e\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011*\u00020\u0013¨\u0006\u0015"}, m3636d2 = {"writeProto", "Lokio/ByteString;", "block", "Lkotlin/Function1;", "Lcom/squareup/wire/ProtoWriter;", "", "Lkotlin/ExtensionFunctionType;", "toRosettaScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/AnyScreen;", "Lcom/robinhood/microgram/sdui/HtmlCanvasScreen;", "Lcom/robinhood/microgram/sdui/StandardScreen;", "Lmicrogram/ui/v1/StandardScreenContentDto;", "Lmicrogram/ui/v1/HtmlCanvasScreenContentDto;", "toEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "Lcom/robinhood/microgram/sdui/LoggingContext;", "Lmicrogram/ui/v1/LoggingContextDto;", "Lcom/robinhood/microgram/sdui/AnyLoggingContext;", "feature-microgram-sdui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.LoggingUtilsKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class LoggingUtils9 {
    private static final ByteString writeProto(Function1<? super ProtoWriter, Unit> function1) {
        Buffer buffer = new Buffer();
        function1.invoke(new ProtoWriter(buffer));
        return buffer.readByteString();
    }

    public static final com.robinhood.rosetta.eventlogging.Screen toRosettaScreen(UiObject<?, ?> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        Object value = uiObject.getValue();
        if (value instanceof StandardScreen) {
            return toRosettaScreen((StandardScreen) value);
        }
        if (value instanceof StandardScreenContentDto) {
            return toRosettaScreen((StandardScreenContentDto) value);
        }
        if (value instanceof HtmlCanvasScreen) {
            return toRosettaScreen((HtmlCanvasScreen) value);
        }
        if (value instanceof HtmlCanvasScreenContentDto) {
            return toRosettaScreen((HtmlCanvasScreenContentDto) value);
        }
        throw new IllegalStateException(("Unknown screen type: " + uiObject).toString());
    }

    public static final com.robinhood.rosetta.eventlogging.Screen toRosettaScreen(HtmlCanvasScreen htmlCanvasScreen) throws IOException {
        ByteString byteString;
        ByteString byteString2;
        Screen.Name name;
        Intrinsics.checkNotNullParameter(htmlCanvasScreen, "<this>");
        Integer rosettaScreenId = htmlCanvasScreen.getRosettaScreenId();
        if (rosettaScreenId == null) {
            Screen.Name name2 = Screen.Name.NAME_UNSPECIFIED;
            byteString2 = ByteString.EMPTY;
            name = name2;
        } else {
            Screen.Name nameFromValue = Screen.Name.INSTANCE.fromValue(rosettaScreenId.intValue());
            Screen.Name name3 = nameFromValue == null ? Screen.Name.NAME_UNSPECIFIED : nameFromValue;
            if (nameFromValue == null) {
                Buffer buffer = new Buffer();
                ProtoWriter protoWriter = new ProtoWriter(buffer);
                protoWriter.writeTag(1, FieldEncoding.VARINT);
                protoWriter.writeVarint32(rosettaScreenId.intValue());
                byteString = buffer.readByteString();
            } else {
                byteString = ByteString.EMPTY;
            }
            byteString2 = byteString;
            name = name3;
        }
        ByteString byteString3 = byteString2;
        String identifier = htmlCanvasScreen.getIdentifier();
        if (identifier == null) {
            identifier = "";
        }
        return new com.robinhood.rosetta.eventlogging.Screen(name, null, identifier, byteString3, 2, null);
    }

    public static final com.robinhood.rosetta.eventlogging.Screen toRosettaScreen(StandardScreen standardScreen) throws IOException {
        ByteString byteString;
        ByteString byteString2;
        Screen.Name name;
        Intrinsics.checkNotNullParameter(standardScreen, "<this>");
        Integer rosettaScreenId = standardScreen.getRosettaScreenId();
        if (rosettaScreenId == null) {
            Screen.Name name2 = Screen.Name.NAME_UNSPECIFIED;
            byteString2 = ByteString.EMPTY;
            name = name2;
        } else {
            Screen.Name nameFromValue = Screen.Name.INSTANCE.fromValue(rosettaScreenId.intValue());
            Screen.Name name3 = nameFromValue == null ? Screen.Name.NAME_UNSPECIFIED : nameFromValue;
            if (nameFromValue == null) {
                Buffer buffer = new Buffer();
                ProtoWriter protoWriter = new ProtoWriter(buffer);
                protoWriter.writeTag(1, FieldEncoding.VARINT);
                protoWriter.writeVarint32(rosettaScreenId.intValue());
                byteString = buffer.readByteString();
            } else {
                byteString = ByteString.EMPTY;
            }
            byteString2 = byteString;
            name = name3;
        }
        ByteString byteString3 = byteString2;
        String identifier = standardScreen.getIdentifier();
        if (identifier == null) {
            identifier = "";
        }
        return new com.robinhood.rosetta.eventlogging.Screen(name, null, identifier, byteString3, 2, null);
    }

    public static final com.robinhood.rosetta.eventlogging.Screen toRosettaScreen(StandardScreenContentDto standardScreenContentDto) {
        Intrinsics.checkNotNullParameter(standardScreenContentDto, "<this>");
        ScreenDto screen = standardScreenContentDto.getScreen();
        if (screen == null) {
            screen = ScreenDto.INSTANCE.getZeroValue();
        }
        return screen.toProto();
    }

    public static final com.robinhood.rosetta.eventlogging.Screen toRosettaScreen(HtmlCanvasScreenContentDto htmlCanvasScreenContentDto) {
        Intrinsics.checkNotNullParameter(htmlCanvasScreenContentDto, "<this>");
        ScreenDto screen = htmlCanvasScreenContentDto.getScreen();
        if (screen == null) {
            screen = ScreenDto.INSTANCE.getZeroValue();
        }
        return screen.toProto();
    }

    public static final Context toEventContext(UiObject<LoggingContext, LoggingContextDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        if (uiObject instanceof UiObject.Legacy) {
            return toEventContext((LoggingContext) ((UiObject.Legacy) uiObject).getValue());
        }
        if (uiObject instanceof UiObject.Idl) {
            return toEventContext((LoggingContextDto) ((UiObject.Idl) uiObject).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Context toEventContext(LoggingContext loggingContext) {
        Intrinsics.checkNotNullParameter(loggingContext, "<this>");
        String entryPointIdentifier = loggingContext.getEntryPointIdentifier();
        if (entryPointIdentifier == null) {
            entryPointIdentifier = "";
        }
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, entryPointIdentifier, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null);
    }

    public static final Context toEventContext(LoggingContextDto loggingContextDto) {
        Intrinsics.checkNotNullParameter(loggingContextDto, "<this>");
        String entry_point_identifier = loggingContextDto.getEntry_point_identifier();
        if (entry_point_identifier == null) {
            entry_point_identifier = "";
        }
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, entry_point_identifier, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null);
    }
}
