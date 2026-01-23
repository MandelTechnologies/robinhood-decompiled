package idl.idl_sample.proto.echo_microgram.p473v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: EchoService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lidl/idl_sample/proto/echo_microgram/v1/EchoService;", "", "Lidl/idl_sample/proto/echo_microgram/v1/EchoStringRequestDto;", "request", "Lidl/idl_sample/proto/echo_microgram/v1/EchoStringResponseDto;", "EchoString", "(Lidl/idl_sample/proto/echo_microgram/v1/EchoStringRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lidl/idl_sample/proto/echo_microgram/v1/EchoStringRepeatedlyRequestDto;", "Lkotlinx/coroutines/flow/Flow;", "Lidl/idl_sample/proto/echo_microgram/v1/EchoStringRepeatedlyResponseDto;", "EchoStringRepeatedly", "(Lidl/idl_sample/proto/echo_microgram/v1/EchoStringRepeatedlyRequestDto;)Lkotlinx/coroutines/flow/Flow;", "idl.sample.microgram.echo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "idl.idl_sample.proto.echo_microgram.v1.EchoService")
/* loaded from: classes14.dex */
public interface EchoService {
    Object EchoString(EchoStringRequestDto echoStringRequestDto, Continuation<? super EchoStringResponseDto> continuation);

    Flow<EchoStringRepeatedlyResponseDto> EchoStringRepeatedly(EchoStringRepeatedlyRequestDto request);
}
