def log(level: Level, msg: => String) =
  if (logger.level.intValue >= level.intValue) logger.log(level, msg)