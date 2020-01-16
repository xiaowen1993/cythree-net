package cc.mrbird.febs.chaoyang3team.dao;

import cc.mrbird.febs.chaoyang3team.domain.MeetingRoom;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

/**
 * @author CHExN
 */
public interface MeetingRoomMapper extends BaseMapper<MeetingRoom> {

    IPage<MeetingRoom> findMeetingRoom(Page page, @Param("meetingRoom") MeetingRoom meetingRoom);

}
