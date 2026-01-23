package idl.idl_sample.proto.echo_microgram.p473v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: ClockService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lidl/idl_sample/proto/echo_microgram/v1/ClockService;", "", "Lidl/idl_sample/proto/echo_microgram/v1/ClockTicksRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lidl/idl_sample/proto/echo_microgram/v1/ClockTicksResponseDto;", "ClockTicks", "(Lidl/idl_sample/proto/echo_microgram/v1/ClockTicksRequestDto;)Lkotlinx/coroutines/flow/Flow;", "idl.sample.microgram.echo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "idl.idl_sample.proto.echo_microgram.v1.ClockService")
/* loaded from: classes14.dex */
public interface ClockService {
    Flow<ClockTicksResponseDto> ClockTicks(ClockTicksRequestDto request);
}
